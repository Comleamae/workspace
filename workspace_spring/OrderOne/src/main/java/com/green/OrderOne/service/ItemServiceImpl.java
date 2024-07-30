package com.green.OrderOne.service;

import com.green.OrderOne.vo.ItemVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("itemService")
public class ItemServiceImpl implements ItemService{
    @Autowired
    private SqlSessionTemplate sqlSession;

    @Override
    public List<ItemVO> getAllItem() {
        return sqlSession.selectList("itemMapper.getAllItem");
    }

    @Override
    public ItemVO getOneItem(int itemNum) {
        return sqlSession.selectOne("itemMapper.getOneItem", itemNum);
    }

    @Override
    public void regItem(ItemVO itemVO) {
        sqlSession.insert("itemMapper.regItem", itemVO);
    }
}
