package com.ysx.sqlfather.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ysx.sqlfather.model.entity.Report;

/**
 * @description 针对表【report(举报)】的数据库操作Service
 */
public interface ReportService extends IService<Report> {

    /**
     * 校验
     *
     * @param report
     * @param add
     */
    void validReport(Report report, boolean add);
}
