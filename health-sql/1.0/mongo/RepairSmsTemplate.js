

/**
 * 修改医生审核通过之后发送通知短信息模板将"{0}"改为"{1}"
 * 2016年1月12日17:14:49
 * wangl
 */

db.b_msg_template.update({"_id":"0007"},{$set:{"content":"{0}您好，您的玄关平台医生资质已审核通过。您可以登录玄关健康（医生端）App，设置服务套餐，为患者服务."}})

/**
 * 修改电话号码为18900000010的客服人员的用户名称
 * 2016年1月12日17:14:49
 * wangl
 */
db.user.update({"telephone":"18900000010"},{$set:{"username":"linda","name":"linda"}})
