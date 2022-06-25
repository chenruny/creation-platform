package com.nrpt.springcloud.search.service;

import com.nrpt.springcloud.search.vo.SearchParamVo;
import com.nrpt.springcloud.search.vo.SearchResult;

public interface MallSearchService {
    /**
     * 检索结果
     * @param paramVo
     * @return
     */
    SearchResult search(SearchParamVo paramVo);
}
