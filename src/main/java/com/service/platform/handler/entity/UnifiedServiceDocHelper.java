package com.service.platform.handler.entity;

/**
 * 统一数据交互报文帮助类
 */
public class UnifiedServiceDocHelper {

    /**
     * 创建统一数据交互对象
     * @param serviceId 服务编号
     * @return
     */
    public static UnifiedServiceDoc newUnifiedServiceDoc_request( String serviceId ){

        // 统一数据交互报文
        UnifiedServiceDoc unifiedServiceDoc = new UnifiedServiceDoc();
        // 数据交互报文详情
        UnifiedServiceDocInfo unifiedServiceDocInfo = new UnifiedServiceDocInfo();
        // 统一报文头部
        UnifiedServiceHeader unifiedServiceHeader = new UnifiedServiceHeader();
        // 统一报文内容
        UnifiedServiceBody unifiedServiceBody = new UnifiedServiceBody();

        // 统一数据交互格式 标准化应答格式
        UnifiedResponseEntity unifiedResponseEntity = new UnifiedResponseEntity();

        unifiedServiceHeader.setServResponse( unifiedResponseEntity );

        unifiedServiceDocInfo.setUnifiedServiceHeader( unifiedServiceHeader );
        unifiedServiceDocInfo.setUnifiedServiceBody( unifiedServiceBody );

        unifiedServiceDoc.setUnifiedServiceDocInfo( unifiedServiceDocInfo );

        return unifiedServiceDoc;
    }


    /**
     * 创建统一数据交互对象
     * @param serviceId 服务id
     * @param status    响应状态
     * @param code      响应编码
     * @param desc      响应编码描述
     * @return
     */
    public static UnifiedServiceDoc newUnifiedServiceDoc_response(String serviceId, String status, String code, String desc ){

        // 统一数据交互报文
        UnifiedServiceDoc unifiedServiceDoc = null;
        unifiedServiceDoc = new UnifiedServiceDoc();
        // 数据交互报文详情
        UnifiedServiceDocInfo unifiedServiceDocInfo = new UnifiedServiceDocInfo();
        // 统一报文头部
        UnifiedServiceHeader unifiedServiceHeader = new UnifiedServiceHeader();
        // 统一报文内容
        UnifiedServiceBody unifiedServiceBody = new UnifiedServiceBody();

        // 统一数据交互格式 标准化应答格式
        UnifiedResponseEntity unifiedResponseEntity = new UnifiedResponseEntity();
        unifiedResponseEntity.setCode( code );
        unifiedResponseEntity.setDesc( desc );
        unifiedResponseEntity.setStatus( status );

        unifiedServiceHeader.setServResponse( unifiedResponseEntity );
        unifiedServiceHeader.setServiceId( serviceId );


        unifiedServiceDocInfo.setUnifiedServiceHeader( unifiedServiceHeader );
        unifiedServiceDocInfo.setUnifiedServiceBody( unifiedServiceBody );

        unifiedServiceDoc.setUnifiedServiceDocInfo( unifiedServiceDocInfo );

        return unifiedServiceDoc;
    }
}
