package com.sifipe.api.util;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;

@XmlRootElement
public class PaginatedListWrapper implements Serializable {
    private Integer currentPage;
    private Integer pageSize;
    private Integer totalResults;

    private String sortFields;
    private String sortDirections;
    @XmlElement
    private List<?> list;
    
    public PaginatedListWrapper(Integer currentPage, String sortFields, String sortDirections, Integer pageSize) {
        setCurrentPage(currentPage);
        setSortFields(sortFields);
        setSortDirections(sortDirections);
        setPageSize(pageSize);
    }

    public PaginatedListWrapper() {
        setCurrentPage(1);
        setSortFields("id");
        setSortDirections("asc");
        setPageSize(1);
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
    }

    public String getSortFields() {
        return sortFields;
    }

    public void setSortFields(String sortFields) {
        this.sortFields = sortFields;
    }

    public String getSortDirections() {
        return sortDirections;
    }

    public void setSortDirections(String sortDirections) {
        this.sortDirections = sortDirections;
    }

    public List getList() {
        return list;
    }

    public void setList(List<?> list) {
        this.list = list;
    }
}
