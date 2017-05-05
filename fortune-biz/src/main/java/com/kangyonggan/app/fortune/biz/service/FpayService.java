package com.kangyonggan.app.fortune.biz.service;

import com.kangyonggan.app.fortune.common.exception.BuildException;
import com.kangyonggan.app.fortune.model.xml.Fpay;

/**
 * 发财付业务核心处理器
 *
 * @author kangyonggan
 * @since 5/4/17
 */
public interface FpayService {

    /**
     * 签约
     *
     * @param fpay 签约请求
     * @return
     * @throws BuildException 构建报文异常
     * @throws Exception      未知异常
     */
    String sign(Fpay fpay) throws BuildException, Exception;

    /**
     * 解约
     *
     * @param fpay 解约请求
     * @return
     * @throws BuildException 构建报文异常
     * @throws Exception      未知异常
     */
    String unsign(Fpay fpay) throws BuildException, Exception;

    /**
     * 单笔代扣
     *
     * @param fpay 代扣请求
     * @return
     * @throws BuildException 构建报文异常
     * @throws Exception      未知异常
     */
    String pay(Fpay fpay) throws BuildException, Exception;

    /**
     * 单笔代付
     *
     * @param fpay 代付请求
     * @return
     * @throws BuildException 构建报文异常
     * @throws Exception      未知异常
     */
    String redeem(Fpay fpay) throws BuildException, Exception;

    /**
     * 交易查询
     *
     * @param fpay 查询请求
     * @return
     * @throws BuildException 构建报文异常
     * @throws Exception      未知异常
     */
    String query(Fpay fpay) throws BuildException, Exception;

    /**
     * 余额查询
     *
     * @param fpay 余额查询请求
     * @return
     * @throws BuildException 构建报文异常
     * @throws Exception      未知异常
     */
    String queryBalance(Fpay fpay) throws BuildException, Exception;

}