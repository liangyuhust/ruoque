package ruoque.crm.util;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Pager<E> {
	private int pageSize;//每页显示多少条  
    private int pageNum;//分页的开始值  
    private int totalSize;//总共多少条记录  
    private int totalPage;//总共多少页  
    private List<E> datas;//放置具体数据的列表 
    
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	
	public int getTotalSize() {
		return totalSize;
	}
	public void setTotalSize(int totalSize) {
		this.totalSize = totalSize;
	}
	
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	
	public List<E> getDatas() {
		return datas;
	}
	public void setDatas(List<E> datas) {
		this.datas = datas;
	}
}
