/**
 * @author Yuqi Chou
 * @version  Nov 6, 2012
 */
package org.nerv.saetest.persistence.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.nerv.framework.persistence.annotation.Pagination;
import org.nerv.framework.util.Page;
import org.springframework.data.domain.PageRequest;

/**
 * @author Yuqi Chou 
 * @version Nov 6, 2012  5:47:33 PM
 */
public interface UserMapper {

	@Select({
        "select count(0) from account",
    })
    int selectAccountCount();
	
	
	@Select({
        "select userid,email from account",
    })
    List<HashMap> selectAccountList();
	
	
	@Select({
        "select userid,email from account",
    })
	@Pagination(countCommand="selectAccountCount")
    Page selectAccountListPage(PageRequest pageRequest);
}
