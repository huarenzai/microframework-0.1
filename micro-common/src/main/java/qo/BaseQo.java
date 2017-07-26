package qo;

import java.io.Serializable;

/**
 * 基类成员
 * Created by Administrator on 2017/7/25.
 */
public class BaseQo implements Serializable {
    private int currentPage;//当前页数
    private int pageSize;//显示页数

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
