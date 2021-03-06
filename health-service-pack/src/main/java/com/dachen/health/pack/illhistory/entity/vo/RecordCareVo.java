package com.dachen.health.pack.illhistory.entity.vo;

import com.dachen.health.pack.illhistory.entity.po.RecordCare;
import com.dachen.util.BeanUtil;

import java.util.List;

/**
 * Created by fuyongde on 2016/12/14.
 */
public class RecordCareVo {

    /**关怀计划的名称**/
    private String name;
    /**订单id**/
    private Integer orderId;
    /**会话id**/
    private String messageGroupId;
    /**是否能进入IM**/
    private Boolean canJoinIM;
    /**主医生**/
    private Integer mainDoctor;
    /**主医生姓名**/
    private String mainDoctorName;
    /**专家组医生id**/
    private List<Integer> groupDoctors;
    /**专家组医生名称**/
    private List<String> groupDoctorNames;
    /**就诊时间**/
    private Long startTime;
    /**所患疾病id**/
    private String diseaseId;
    /**所患疾病**/
    private String disease;
    /**病症时长**/
    private String diseaseDuration;
    /**病情描述**/
    private String diseaseDesc;
    /**药物商品id**/
    private List<String> drugGoodsIds;

    /**药品详情**/
    private List<DrugInfoVo> drugInfoVos;
    /**用药图片资料**/
    private List<String> drugPicUrls;
    /**用药情况**/
    private String drugCase;
    /**希望获得医生什么帮助**/
    private String hopeHelp;
    /**图片信息**/
    private List<String> pics;
    /**是否就诊过**/
    private Boolean isSeeDoctor;
    /**是否已付款**/
    private Boolean isPay;

    /**关怀小节**/
    private List<CareTip> careTips;
    /**咨询结果**/
    private OrderResult orderResult;
    
    private String patientName;
    /**医生id**/
    private Integer doctorId;

    /**诊治情况**/
    private String treatCase;

    public String getTreatCase() {
        return treatCase;
    }

    public void setTreatCase(String treatCase) {
        this.treatCase = treatCase;
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public Boolean getCanJoinIM() {
        return canJoinIM;
    }

    public void setCanJoinIM(Boolean canJoinIM) {
        this.canJoinIM = canJoinIM;
    }

    public List<DrugInfoVo> getDrugInfoVos() {
        return drugInfoVos;
    }

    public void setDrugInfoVos(List<DrugInfoVo> drugInfoVos) {
        this.drugInfoVos = drugInfoVos;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public List<String> getGroupDoctorNames() {
        return groupDoctorNames;
    }

    public void setGroupDoctorNames(List<String> groupDoctorNames) {
        this.groupDoctorNames = groupDoctorNames;
    }

    public String getMainDoctorName() {
        return mainDoctorName;
    }

    public void setMainDoctorName(String mainDoctorName) {
        this.mainDoctorName = mainDoctorName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getMessageGroupId() {
        return messageGroupId;
    }

    public void setMessageGroupId(String messageGroupId) {
        this.messageGroupId = messageGroupId;
    }

    public Integer getMainDoctor() {
        return mainDoctor;
    }

    public void setMainDoctor(Integer mainDoctor) {
        this.mainDoctor = mainDoctor;
    }

    public List<Integer> getGroupDoctors() {
        return groupDoctors;
    }

    public void setGroupDoctors(List<Integer> groupDoctors) {
        this.groupDoctors = groupDoctors;
    }

    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public String getDiseaseId() {
        return diseaseId;
    }

    public void setDiseaseId(String diseaseId) {
        this.diseaseId = diseaseId;
    }

    public String getDiseaseDuration() {
        return diseaseDuration;
    }

    public void setDiseaseDuration(String diseaseDuration) {
        this.diseaseDuration = diseaseDuration;
    }

    public String getDiseaseDesc() {
        return diseaseDesc;
    }

    public void setDiseaseDesc(String diseaseDesc) {
        this.diseaseDesc = diseaseDesc;
    }

    public List<String> getDrugGoodsIds() {
        return drugGoodsIds;
    }

    public void setDrugGoodsIds(List<String> drugGoodsIds) {
        this.drugGoodsIds = drugGoodsIds;
    }

    public List<String> getDrugPicUrls() {
        return drugPicUrls;
    }

    public void setDrugPicUrls(List<String> drugPicUrls) {
        this.drugPicUrls = drugPicUrls;
    }

    public String getDrugCase() {
        return drugCase;
    }

    public void setDrugCase(String drugCase) {
        this.drugCase = drugCase;
    }

    public String getHopeHelp() {
        return hopeHelp;
    }

    public void setHopeHelp(String hopeHelp) {
        this.hopeHelp = hopeHelp;
    }

    public List<String> getPics() {
        return pics;
    }

    public void setPics(List<String> pics) {
        this.pics = pics;
    }

    public Boolean getSeeDoctor() {
        return isSeeDoctor;
    }

    public void setSeeDoctor(Boolean seeDoctor) {
        isSeeDoctor = seeDoctor;
    }

    public Boolean getPay() {
        return isPay;
    }

    public void setPay(Boolean pay) {
        isPay = pay;
    }

    public List<CareTip> getCareTips() {
        return careTips;
    }

    public void setCareTips(List<CareTip> careTips) {
        this.careTips = careTips;
    }

    public OrderResult getOrderResult() {
        return orderResult;
    }

    public void setOrderResult(OrderResult orderResult) {
        this.orderResult = orderResult;
    }

    public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public static RecordCareVo formRecordCare(RecordCare recordCare) {
        return BeanUtil.copy(recordCare, RecordCareVo.class);
    }
}
