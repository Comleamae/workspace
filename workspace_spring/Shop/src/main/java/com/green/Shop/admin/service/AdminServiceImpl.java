package com.green.Shop.admin.service;

import com.green.Shop.item.vo.CategoryVO;
import com.green.Shop.item.vo.ItemVO;
import com.green.Shop.member.vo.MemberVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("adminService")
public class AdminServiceImpl implements AdminService{
    @Autowired
    private SqlSessionTemplate sqlSession;

    @Override
    public List<CategoryVO> getCateList() {
        return sqlSession.selectList("adminMapper.getCateList");
    }

    @Override
    public void regItem(ItemVO itemVO) {
        sqlSession.insert("adminMapper.regItem", itemVO);
    }

    @Override
    public void deleteItem(int itemCode) {
        sqlSession.delete("adminMapper.deleteItem", itemCode);
    }

    @Override
    public void insertImgs(ItemVO itemVO) {
        sqlSession.insert("adminMapper.insertImgs", itemVO);
    }

    //다음에 들어갈 item_code 조회
    @Override
    public int getNextItemCode() {
        return sqlSession.selectOne("adminMapper.getNextItemCode");
    }

    @Override
    public void regCategory(CategoryVO categoryVO) {
        sqlSession.insert("adminMapper.regCategory", categoryVO);
    }

    @Override
    public void deleteCategory(int cateCode) {
        sqlSession.delete("adminMapper.deleteCategory", cateCode);
    }

    @Override
    public List<MemberVO> getAllUser() {
        return sqlSession.selectList("adminMapper.getAllUser");
    }
}
