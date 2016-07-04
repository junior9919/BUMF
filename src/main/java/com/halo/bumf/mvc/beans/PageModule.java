/**
 * 
 */
package com.halo.bumf.mvc.beans;

/**
 * 
 * @author zyl
 * @date 2016年7月4日 下午7:40:18
 * @version
 * @since
 */
public class PageModule {

	private int firstRow;

	private int totalRow;

	private int currentPage;

	/**
	 * @return 分页参数，当前页第一行在数据库中记录的行号
	 */
	public int getFirstRow() {
		return firstRow;
	}

	/**
	 * @param firstRow
	 *            分页参数，当前页第一行在数据库中记录的行号
	 */
	public void setFirstRow(int firstRow) {
		this.firstRow = firstRow;
	}

	/**
	 * @return the totalRow
	 */
	public int getTotalRow() {
		return totalRow;
	}

	/**
	 * @param totalRow
	 *            the totalRow to set
	 */
	public void setTotalRow(int totalRow) {
		this.totalRow = totalRow;
	}

	/**
	 * @return 当前页码
	 */
	public int getCurrentPage() {
		return currentPage;
	}

	/**
	 * @param currentPage
	 *            当前页码
	 */
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	/**
	 * 
	 * @return 总页数
	 */
	public int getTotalPage() {
		int pages = totalRow / ROWS_PER_PAGE;
		int remainder = totalRow % ROWS_PER_PAGE;
		if (remainder > 0) {
			pages = pages + 1;
		}

		return pages;
	}

	/**
	 * 每页的行数
	 */
	public final int ROWS_PER_PAGE = 20;

}
