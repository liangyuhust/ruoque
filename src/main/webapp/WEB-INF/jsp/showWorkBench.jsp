<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <meta name="description" content="客户关系管理界面">
    <meta name="author" content="梁誉">

    <title>客户关系管理工作界面</title>

    <!-- 层叠样式 -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/workbench.css" rel="stylesheet">
</head>

<body>
<div class="myheading">
    <nav class="navbar navbar-inverse">
        <div class="container">
            <div class="navbar-header">
                <a class="navbar-brand" href="#">
                    <img src="images/logo.png" style="width: 75px">
                </a>
            </div>
            <div id="navbar" class="collapse navbar-collapse">
                <ul class="nav navbar-nav">
                    <li  class="active"><a href=".visit_monitor"  data-toggle="tab">咨询登记</a></li>
                    <li><a href=".sale_monitor" data-toggle="tab">售房管理</a></li>
                    <li><a href=".statistics" data-toggle="tab">信息统计</a></li>
                    <li><a href=".sys_manage" data-toggle="tab">系统管理</a></li>
                </ul>
                <a type="button" class="btn btn-default navbar-btn navbar-right" href="./logout">退出</a>
            </div>
        </div>
    </nav>
</div>
<div class="mybody container">
    <div class="row">
        <div class="leftmemu col-md-3 col-sm-5">
            <div class="tab-content">
                <div class="tab-pane visit_monitor active">
                    <div class="list-group nav">
                        <a href="#myComer" class="list-group-item active"  data-toggle="tab">来人信息登记</a>
                        <a href="#myCall" class="list-group-item" data-toggle="tab">来电信息登记</a>
                    </div>
                </div>
                <div class="tab-pane sale_monitor">
                    <div class="list-group nav">
                        <a href="#mySaleOrder" class="list-group-item active"  data-toggle="tab">购房订单管理</a>
                        <a href="#mySaleContract" class="list-group-item"  data-toggle="tab">购房合同管理</a>
                    </div>
                </div>
                <div class="tab-pane statistics">
                    <div class="list-group nav">
                        <a href="#myComerStatistics" class="list-group-item active" data-toggle="tab">来人信息统计</a>
                        <a href="#myCallStatistics" class="list-group-item" data-toggle="tab">来电信息统计</a>
                        <a href="#mySaleOrderStatistics" class="list-group-item" data-toggle="tab">订单信息统计</a>
                        <a href="#mySaleContractStatistics" class="list-group-item" data-toggle="tab">合同信息统计</a>
                    </div>
                </div>
                <div class="tab-pane sys_manage">
                    <div class="list-group nav">
                        <a href="#myDepartmentManage" class="list-group-item active"  data-toggle="tab">部门及分子公司管理</a>
                        <a href="#myStaffManage" class="list-group-item"  data-toggle="tab">员工账号管理</a>
                        <a href="#myRoleManage" class="list-group-item"  data-toggle="tab">权限角色管理</a>
                    </div>
                </div>
            </div>
        </div>
        <div class="content col-md-9 col-sm-7">
          <div class="tab-content">
            <div class="tab-pane visit_monitor active">
                 <div class="tab-content">
                    <div id="myComer" class="tab-pane active">
                        <ol class="breadcrumb">
                            <li><a href="#">咨询登记</a></li>
                            <li class="active"><a href="#">来人信息登记</a></li>
                        </ol>
                        <div class="btn-group nav">
                            <button data-target="#myComerTable" type="button" class="btn btn-item btn-default active" data-toggle="tab" >来人信息列表</button>
                            <button data-target="#myComerNew" type="button" class="btn btn-item btn-default" data-toggle="tab" >添加来人信息</button>
                        </div>
                        <div><br/></div>
                        <div class="tab-content">
                            <div id="myComerTable" class="tab-pane table-responsive active">
                               <table class="table table-hover table-condensed ">
                                  <thead>
                                    <tr>
                                        <th>来访日期</th>
                                        <th>客户姓名</th>
                                        <th>性别</th>
                                        <th>电话</th>
                                        <th>业务员</th>
                                        <th>操作</th>
                                    </tr>
                                  </thead>
                                  <tbody id="comer_pg"/>
                               </table>
                               <nav class="pull-right">
                                  <ul class="pagination" id="comerPagination"></ul>
                               </nav>
                            </div>
                            <div id="myComerNew" class="tab-pane col-sm-10">
                               <form id="myComerNewForm" class="form-horizontal" action="#">
                                   <div class="form-group">
                                        <label for="inputComerName" class="col-sm-2 control-label">客户姓名:</label>
                                        <div class="col-sm-4">
                                            <input type="text" class="form-control" id="inputComerName" placeholder="姓名">
                                        </div>
                                        <label for="inputComerPhone" class="col-sm-2 control-label">联系方式:</label>
                                        <div class="col-sm-4">
                                            <input type="tel" class="form-control" id="inputComerPhone" placeholder="电话">
                                        </div>
                                   </div>
                                   <div class="form-group">
                                        <label class="col-sm-2 control-label">客户性别:</label>
                                        <div class="col-sm-4">
                                            <label class="radio-inline">
                                                <input type="radio" name="inputComerGender" checked value="male">男
                                            </label>
                                            <label class="radio-inline">
                                                <input type="radio" name="inputComerGender"  value="female">女
                                            </label>
                                        </div>
                                        <label for="inputComerDate" class="col-sm-2 control-label">来访日期:</label>
                                        <div class="col-sm-4">
                                            <input type="date" class="form-control" id="inputComerDate" placeholder="来访日期">
                                        </div>
                                   </div>
                                   <div class="form-group">
                                        <label for="inputComerType" class="col-sm-2 control-label">来客类型:</label>
                                        <div class="col-sm-4">
                                            <input type="text" class="form-control" id="inputComerType" placeholder="来客类型">
                                        </div>
                                        <label for="inputComerCategory" class="col-sm-2 control-label">来客类别:</label>
                                        <div class="col-sm-4">
                                            <input type="text" class="form-control" id="inputComerCategory" placeholder="来客类别">
                                        </div>
                                   </div>
                                   <div class="form-group">
                                        <label for="inputComerTransportMeans" class="col-sm-2 control-label">交通工具:</label>
                                        <div class="col-sm-4">
                                            <input type="text" class="form-control" id="inputComerTransportMeans" placeholder="交通工具">
                                        </div>
                                        <label for="inputComerTime" class="col-sm-2 control-label">来访时间:</label>
                                        <div class="col-sm-4">
                                            <input type="time" class="form-control" id="inputComerTime" placeholder="来访时间">
                                        </div>
                                   </div>
                                   <div class="form-group">
                                        <label  class="col-sm-2 control-label">时间段:</label>
                                        <div class="col-sm-4">
                                            <select name="transportMeans" class="form-control">
                                                 <option>早上</option>
                                                 <option>中午</option>
                                                 <option>下午</option>
                                                 <option>晚上</option>
                                            </select>
                                        </div>
                                        <label class="col-sm-2 control-label">婚姻状况:</label>
                                        <div class="col-sm-4">
                                            <select name="maritalStatus" class="form-control">
                                                 <option>未婚</option>
                                                 <option>已婚</option>
                                                 <option>离异</option>
                                            </select>
                                        </div>
                                   </div>
                                   <div class="form-group">
                                        <label for="inputComerAge" class="col-sm-2 control-label">客户年龄:</label>
                                        <div class="col-sm-4">
                                            <input type="number" class="form-control" id="inputComerAge"  min="1" max="150" placeholder="年龄">
                                        </div>
                                        <label class="col-sm-2 control-label">住房情况:</label>
                                        <div class="col-sm-4">
                                            <select name="housingSituation" class="form-control">
                                                 <option>租房</option>
                                                 <option>单位住房</option>
                                                 <option>借住</option>
                                                 <option>自有房</option>
                                            </select>
                                        </div>
                                   </div>
                                   <div class="form-group">
                                        <label for="inputComerArea" class="col-sm-2 control-label">居住面积:</label>
                                        <div class="col-sm-4">
                                            <input type="number" class="form-control" id="inputComerArea"  min="0" placeholder="面积">
                                        </div>
                                        <label class="col-sm-2 control-label">现生活区域:</label>
                                        <div class="col-sm-4">
                                            <select name="livingRegion" class="form-control">
                                                 <option>金华市区</option>
                                                 <option>西关街道</option>
                                                 <option>秋滨街道</option>
                                                 <option>江北</option>
                                            </select>
                                        </div>
                                   </div>
                                   <div class="form-group">
                                        <label class="col-sm-2 control-label">居住地址:</label>
                                        <div class="col-sm-10">
                                            <input type="text" name="addr" class="form-control" placeholder="客户居住地址">
                                        </div>
                                   </div>
                                   <div class="form-group">
                                        <label class="col-sm-2 control-label">现工作区域:</label>
                                        <div class="col-sm-4">
                                            <select name="workingRegion" class="form-control">
                                                 <option>金华市区</option>
                                                 <option>西关街道</option>
                                                 <option>秋滨街道</option>
                                                 <option>江北</option>
                                            </select>
                                        </div>
                                        <label class="col-sm-2 control-label">媒体:</label>
                                        <div class="col-sm-4">
                                            <select name="medium" class="form-control">
                                                 <option>报纸</option>
                                                 <option>电视</option>
                                                 <option>短信</option>
                                                 <option>外展</option>
                                            </select>
                                        </div>
                                   </div>
                                   <div class="form-group">
                                        <label class="col-sm-2 control-label">品类需求:</label>
                                        <div class="col-sm-4">
                                            <select name="categoryDemand" class="form-control">
                                                 <option>金华市区</option>
                                                 <option>西关街道</option>
                                                 <option>秋滨街道</option>
                                                 <option>江北</option>
                                            </select>
                                        </div>
                                        <label for="inputComerAreaDemand" class="col-sm-2 control-label">需求面积:</label>
                                        <div class="col-sm-4">
                                            <input type="number" class="form-control" id="inputComerAreaDemand"  min="0" placeholder="需求面积">
                                        </div>
                                   </div>
                                   <div class="form-group">
                                        <label for="inputComerParkingDemand" class="col-sm-2 control-label">车位面积:</label>
                                        <div class="col-sm-4">
                                            <input type="text" class="form-control" id="inputComerParkingDemand"  placeholder="车位需求">
                                        </div>
                                        <label for="inputComerRoomNumDemand" class="col-sm-2 control-label">房数需求:</label>
                                        <div class="col-sm-4">
                                            <input type="number" class="form-control" id="inputComerRoomNumDemand"  min="1" placeholder="房数需求">
                                        </div>
                                   </div>
                                   <div class="form-group">
                                        <label for="inputComerUnitPrice" class="col-sm-2 control-label">单价:</label>
                                        <div class="col-sm-4">
                                            <input type="text" class="form-control" id="inputComerUnitPrice"  placeholder="单价">
                                        </div>
                                        <label for="inputComerGrossPrice" class="col-sm-2 control-label">总价需求:</label>
                                        <div class="col-sm-4">
                                            <input type="text" class="form-control" id="inputComerGrossPrice"  placeholder="总价需求">
                                        </div>
                                   </div>
                                   <div class="form-group">
                                        <label for="inputComerVocation" class="col-sm-2 control-label">行业:</label>
                                        <div class="col-sm-4">
                                            <input type="text" class="form-control" id="inputComerVocation"  placeholder="行业">
                                        </div>
                                        <label for="inputComerPurchaseMotive" class="col-sm-2 control-label">购房动机:</label>
                                        <div class="col-sm-4">
                                            <input type="text" class="form-control" id="inputComerPurchaseMotive"  placeholder="购房动机">
                                        </div>
                                   </div>
                                   <div class="form-group">
                                        <label class="col-sm-2 control-label">付款方式:</label>
                                        <div class="col-sm-4">
                                            <select name="paymentMethod" class="form-control">
                                                 <option>现金支付</option>
                                                 <option>支票支付</option>
                                                 <option>刷卡支付</option>
                                                 <option>公积金贷款</option>
                                                 <option>商业贷款</option>
                                            </select>
                                        </div>
                                        <label class="col-sm-2 control-label">询问重点:</label>
                                        <div class="col-sm-4">
                                            <select name="inquiryFocuse" class="form-control">
                                                 <option>投资</option>
                                                 <option>自住</option>
                                                 <option>价格</option>
                                                 <option>其他</option>
                                            </select>
                                        </div>
                                   </div>
                                   <div class="form-group">
                                        <label for="inputComerRecommendHousehold" class="col-sm-2 control-label">推荐户型:</label>
                                        <div class="col-sm-4">
                                            <input type="text" class="form-control" name="recommendHousehold" id="inputComerRecommendHousehold"  placeholder="推荐户型">
                                        </div>
                                        <label for="inputComerRecommendHouseNo" class="col-sm-2 control-label">推荐房号:</label>
                                        <div class="col-sm-4">
                                            <input type="text" class="form-control" name="recommendHouseNo" id="inputComerRecommendHouseNo"  placeholder="推荐房号">
                                        </div>
                                   </div>
                                   <div class="form-group">
                                        <label  class="col-sm-2 control-label">服务满意度:</label>
                                        <div class="col-sm-4">
                                            <select name="serviceSatisfaction" class="form-control">
                                                 <option>很满意</option>
                                                 <option>满意</option>
                                                 <option>一般</option>
                                                 <option>不满意</option>
                                                 <option>很不满意</option>
                                            </select>
                                        </div>
                                        <label for="inputComerSalesman" class="col-sm-2 control-label">业务员:</label>
                                        <div class="col-sm-4">
                                            <input type="text" class="form-control" name="salesman" id="inputComerSalesman"  placeholder="业务员">
                                        </div>
                                   </div>
                                   <div class="form-group">
                                        <label class="col-sm-2 control-label">备注:</label>
                                        <div class="col-sm-10">
                                            <textarea name="memo" class="form-control"  rows="5"></textarea>
                                        </div>
                                   </div>
                                   <div class="form-group">
                                        <label class="col-sm-2 control-label">反馈信息:</label>
                                        <div class="col-sm-10">
                                            <textarea name="feedback" class="form-control"  rows="5"></textarea>
                                        </div>
                                   </div>
                                   <div class="form-group">
                                        <div class="col-md-offset-4 col-md-4 col-sm-offset-4 col-sm-4 ">
                                            <button class="btn btn-primary btn-block" >提交</button>
                                        </div>
                                   </div>
                               </form>
                            </div>
                        </div>
                        
                    </div>
                    <div id="myCall"  class="tab-pane">
                        <ol class="breadcrumb">
                            <li><a href="#">咨询登记</a></li>
                            <li class="active"><a href="#">来电信息登记</a></li>
                        </ol>
                        <div class="btn-group nav">
                            <button data-target="#myCallTable" type="button" class="btn btn-item btn-default active" data-toggle="tab" >来电信息列表</button>
                            <button data-target="#myCallNew" type="button" class="btn btn-item btn-default" data-toggle="tab" >添加来电信息</button>
                        </div>
                        <div><br/></div>
                        <div class="tab-content">
                            <div id="myCallTable" class="tab-pane table-responsive active">
                               <table class="table table-hover table-condensed ">
                                  <thead>
                                     <tr>
                                         <th>来电日期</th>
                                         <th>客户姓名</th>
                                         <th>性别</th>
                                         <th>客户电话</th>
                                         <th>来电时间</th>
                                         <th>归属</th>
                                         <th>职业顾问</th>
                                         <th>客户分类</th>
                                         <th>媒体</th>
                                         <th>操作</th>
                                     </tr>
                                  </thead>
                                  <tbody id="call_pg">
                                  </tbody>
                               </table>
                               <nav class="pull-right">
                                  <ul class="pagination" id="callPagination"></ul>
                               </nav>
                            </div>
                            <div id="myCallNew" class="tab-pane col-sm-10">
                                <form id="myCallNewForm" class="form-horizontal" action="#">
                                   <div class="form-group">
                                        <label for="inputCallName" class="col-sm-2 control-label">客户姓名:</label>
                                        <div class="col-sm-4">
                                            <input type="text" class="form-control" name="name" id="inputCallName" placeholder="姓名">
                                        </div>
                                        <label for="inputCallPhone" class="col-sm-2 control-label">电话号码:</label>
                                        <div class="col-sm-4">
                                            <input type="tel" class="form-control" name="phone" id="inputCallPhone" placeholder="电话">
                                        </div>
                                   </div>
                                   <div class="form-group">
                                        <label class="col-sm-2 control-label">客户性别:</label>
                                        <div class="col-sm-4">
                                            <label class="radio-inline">
                                                <input type="radio" name="gender" checked value="male">男
                                            </label>
                                            <label class="radio-inline">
                                                <input type="radio" name="gender"  value="female">女
                                            </label>
                                        </div>
                                        <label for="inputCallPropertyConsultant" class="col-sm-2 control-label">置业顾问:</label>
                                        <div class="col-sm-4">
                                            <input type="text" class="form-control" name="propertyConsultant" id="inputCallPropertyConsultant" placeholder="职业顾问">
                                        </div>
                                   </div>
                                   <div class="form-group">
                                        <label for="inputCallDate" class="col-sm-2 control-label">来电日期:</label>
                                        <div class="col-sm-4">
                                            <input type="date" class="form-control" name="callDate" id="inputCallDate" placeholder="来电日期">
                                        </div>
                                        <label for="inputCallTime" class="col-sm-2 control-label">来电时间:</label>
                                        <div class="col-sm-4">
                                            <input type="time" class="form-control" name="callTime" id="inputCallTime" placeholder="来电时间">
                                        </div>
                                   </div>
                                   <div class="form-group">
                                        <label for="inputCallOwner" class="col-sm-2 control-label">归属:</label>
                                        <div class="col-sm-4">
                                            <input type="tel" class="form-control" name="owner" id="inputCallOwner" placeholder="归属">
                                        </div>
                                        <label  class="col-sm-2 control-label">客户分类:</label>
                                        <div class="col-sm-4">
                                            <select name="category" class="form-control">
                                                 <option>金华市区</option>
                                                 <option>西关街道</option>
                                                 <option>秋滨街道</option>
                                                 <option>江北</option>
                                                 <option>江南</option>
                                            </select>
                                        </div>
                                   </div>
                                   <div class="form-group">
                                        <label  class="col-sm-2 control-label">媒体:</label>
                                        <div class="col-sm-4">
                                            <select name="medium" class="form-control">
                                                 <option>报纸</option>
                                                 <option>电视</option>
                                                 <option>短信</option>
                                                 <option>外展</option>
                                                 <option>户外广告牌</option>
                                            </select>
                                        </div>
                                        <label  class="col-sm-2 control-label">询问重点</label>
                                        <div class="col-sm-4">
                                            <select name="inquiryFocuse" class="form-control">
                                                 <option>投资</option>
                                                 <option>自住</option>
                                                 <option>价格</option>
                                                 <option>其他</option>
                                            </select>
                                        </div>
                                   </div>
                                   <div class="form-group">
                                        <label class="col-sm-2 control-label">备注:</label>
                                        <div class="col-sm-10">
                                            <textarea name="memo" class="form-control"  rows="5"></textarea>
                                        </div>
                                   </div>
                                   <div class="form-group">
                                        <label class="col-sm-2 control-label">反馈信息:</label>
                                        <div class="col-sm-10">
                                            <textarea name="feedback" class="form-control"  rows="5"></textarea>
                                        </div>
                                   </div>
                                   <div class="form-group">
                                        <div class="col-md-offset-4 col-md-4 col-sm-offset-4 col-sm-4 ">
                                            <button class="btn btn-primary btn-block" >提交</button>
                                        </div>
                                   </div>
                               </form>
                            </div>
                        </div>
                    </div>
                 </div>
            </div>
            <div class="tab-pane sale_monitor">
                <div class="tab-content">
                    <div id="mySaleOrder" class="tab-pane active">
                        <ol class="breadcrumb">
                           <li><a href="#">售房管理</a></li>
                           <li class="active"><a href="#">购房订单</a></li>
                        </ol>
                        <div class="btn-group nav">
                            <button data-target="#mySaleOrderTable" type="button" class="btn btn-item btn-default active" data-toggle="tab" >购房订单列表</button>
                            <button data-target="#mySaleOrderNew" type="button" class="btn btn-item btn-default" data-toggle="tab" >添加购房订单</button>
                        </div>
                        <div><br/></div>
                        <div class="tab-content">
                            <div id="mySaleOrderTable" class="tab-pane table-responsive active">
                               <table class="table table-hover table-condensed ">
                                  <thead>
                                    <tr>
                                       <th>楼号</th>
                                       <th>单元号</th>
                                       <th>房号</th>
                                       <th>建筑面积</th>
                                       <th>可使用面积</th>
                                       <th>成交房款</th>
                                       <th>订单姓名</th>
                                       <th>联系电话</th>
                                       <th>订单日期</th>
                                       <th>操作</th>
                                    </tr>
                                  </thead>
                                  <tbody id="saleOrder_pg">
                                  </tbody>
                               </table>
                               <nav class="pull-right">
                                  <ul class="pagination" id="saleOrderPagination"></ul>
                               </nav>
                            </div>
                            <div id="mySaleOrderNew" class="tab-pane col-sm-10">
                                <form id="mySaleOrderNewForm"  class="form-horizontal" action="#">
                                     <div class="form-group">
                                          <label for="inputSaleBuilding" class="col-sm-2 control-label">楼号:</label>
                                          <div class="col-sm-4">
                                               <input type="text" class="form-control" id="inputSaleBuilding" name="building" placeholder="楼号">
                                          </div>
                                          <label for="inputSaleUnit" class="col-sm-2 control-label">单元号:</label>
                                          <div class="col-sm-4">
                                               <input type="text" class="form-control" id="inputSaleUnit" name="unit" placeholder="单元号">
                                          </div>
                                     </div>
                                     <div class="form-group">
                                          <label for="inputSaleRoom" class="col-sm-2 control-label">房号:</label>
                                          <div class="col-sm-4">
                                               <input type="text" class="form-control" id="inputSaleRoom" name="room" placeholder="房号">
                                          </div>
                                          <label for="inputSaleMainRoomArea" class="col-sm-2 control-label">主房面积:</label>
                                          <div class="col-sm-4">
                                               <input type="number" class="form-control" id="inputSaleMainRoomArea" name="mainRoomArea" min="0" placeholder="主房面积">
                                          </div>
                                     </div>
                                     <div class="form-group">
                                          <label for="inputSaleBasementArea" class="col-sm-2 control-label">地下室面积:</label>
                                          <div class="col-sm-4">
                                               <input type="number" class="form-control" id="inputSaleBasementArea" name="basementArea" min="0" placeholder="地下室面积">
                                          </div>
                                          <label for="inputSaleGardenArea" class="col-sm-2 control-label">花园面积:</label>
                                          <div class="col-sm-4">
                                               <input type="number" class="form-control" id="inputSaleGardenArea" name="gardenArea" min="0" placeholder="花园面积">
                                          </div>
                                     </div>
                                     <div class="form-group">
                                          <label for="inputSaleAvailableArea" class="col-sm-2 control-label">可使用面积:</label>
                                          <div class="col-sm-4">
                                               <input type="number" class="form-control" id="inputSaleAvailableArea" name="availableArea" min="0" placeholder="可使用面积">
                                          </div>
                                          <label for="inputSaleOriginalPrice" class="col-sm-2 control-label">原价:</label>
                                          <div class="col-sm-4">
                                               <input type="number" class="form-control" id="inputSaleOriginalPrice" name="originalPrice" min="0" placeholder="原价">
                                          </div>
                                     </div>
                                     <div class="form-group">
                                          <label for="inputSalePreferentialPrice" class="col-sm-2 control-label">优惠价:</label>
                                          <div class="col-sm-4">
                                               <input type="number" class="form-control" id="inputSalePreferentialPrice" name="preferentialPrice" min="0" placeholder="优惠价">
                                          </div>
                                          <label for="inputSaleTransactionPrice" class="col-sm-2 control-label">成交房款:</label>
                                          <div class="col-sm-4">
                                               <input type="number" class="form-control" id="inputSaleTransactionPrice" name="transactionPrice" min="0" placeholder="成交房款">
                                          </div>
                                     </div>
                                     <div class="form-group">
                                          <label for="inputSaleOrderName" class="col-sm-2 control-label">订单姓名:</label>
                                          <div class="col-sm-4">
                                               <input type="text" class="form-control" id="inputSaleOrderName" name="orderName" placeholder="订单姓名">
                                          </div>
                                          <label for="inputSaleOrderID" class="col-sm-2 control-label">身份证号:</label>
                                          <div class="col-sm-4">
                                               <input type="text" class="form-control" id="inputSaleOrderID" name="orderID" placeholder="身份证号">
                                          </div>
                                     </div>
                                     <div class="form-group">
                                          <label for="inputSaleOrderPhone" class="col-sm-2 control-label">联系电话:</label>
                                          <div class="col-sm-4">
                                               <input type="tel" class="form-control" id="inputSaleOrderPhone" name="orderPhone" >
                                          </div>
                                          <label for="inputSaleOrderDate" class="col-sm-2 control-label">订单日期:</label>
                                          <div class="col-sm-4">
                                               <input type="date" class="form-control" id="inputSaleOrderDate" name="transactionPrice" >
                                          </div>
                                     </div>
                                     <div class="form-group">
                                          <label for="inputSaleScheduledSignedDate" class="col-sm-2 control-label">预定签购房合同时间:</label>
                                          <div class="col-sm-4">
                                               <input type="date" class="form-control" id="inputSaleScheduledSignedDate" name="scheduledSignedDate" >
                                          </div>
                                          <label for="inputSaleSalemen" class="col-sm-2 control-label">业务员:</label>
                                          <div class="col-sm-4">
                                               <input type="text" class="form-control" id="inputSaleSalemen" name="salemen" >
                                          </div>
                                     </div>
                                     <div class="form-group">
                                          <div class="col-md-offset-4 col-md-4 col-sm-offset-4 col-sm-4 ">
                                               <button type="submit" class="btn btn-primary btn-block" >提交</button>
                                          </div>
                                     </div>
                               </form>
                            </div>
                        </div>
                    </div>
                    <div id="mySaleContract" class="tab-pane">
                        <ol class="breadcrumb">
                           <li><a href="#">售房管理</a></li>
                           <li class="active"><a href="#">购房合同</a></li>
                        </ol>
                        <div class="btn-group nav">
                            <button data-target="#mySaleContractTable" type="button" class="btn btn-item btn-default active" data-toggle="tab" >购房合同列表</button>
                            <button data-target="#mySaleContractNew" type="button" class="btn btn-item btn-default" data-toggle="tab" >添加购房合同</button>
                        </div>
                        <div><br/></div>
                        <div class="tab-content">
                            <div id="mySaleContractTable" class="tab-pane table-responsive active">
                               <table class="table table-hover table-condensed ">
                                  <thead>
                                    <tr>
                                       <th>楼号</th>
                                       <th>单元号</th>
                                       <th>房号</th>
                                       <th>建筑面积</th>
                                       <th>可使用面积</th>
                                       <th>成交房款</th>
                                       <th>订单姓名</th>
                                       <th>联系电话</th>
                                       <th>订单日期</th>
                                       <th>操作</th>
                                    </tr>
                                  </thead>
                                  <tbody id="saleContract_pg">
                                  </tbody>
                               </table>
                               <nav class="pull-right">
                                  <ul class="pagination" id="saleContractPagination"></ul>
                               </nav>
                            </div>
                            <div id="mySaleContractNew" class="tab-pane col-sm-10">
                                <form id="mySaleContractNewForm" class="form-horizontal" action="#">
                                     <div class="form-group">
                                          <label for="inputSaleBuilding" class="col-sm-2 control-label">楼号:</label>
                                          <div class="col-sm-4">
                                               <input type="text" class="form-control" id="inputSaleBuilding" name="building" placeholder="楼号">
                                          </div>
                                          <label for="inputSaleUnit" class="col-sm-2 control-label">单元号:</label>
                                          <div class="col-sm-4">
                                               <input type="text" class="form-control" id="inputSaleUnit" name="unit" placeholder="单元号">
                                          </div>
                                     </div>
                                     <div class="form-group">
                                          <label for="inputSaleRoom" class="col-sm-2 control-label">房号:</label>
                                          <div class="col-sm-4">
                                               <input type="text" class="form-control" id="inputSaleRoom" name="room" placeholder="房号">
                                          </div>
                                          <label for="inputSaleMainRoomArea" class="col-sm-2 control-label">主房面积:</label>
                                          <div class="col-sm-4">
                                               <input type="number" class="form-control" id="inputSaleMainRoomArea" name="mainRoomArea" min="0" placeholder="主房面积">
                                          </div>
                                     </div>
                                     <div class="form-group">
                                          <label for="inputSaleBasementArea" class="col-sm-2 control-label">地下室面积:</label>
                                          <div class="col-sm-4">
                                               <input type="number" class="form-control" id="inputSaleBasementArea" name="basementArea" min="0" placeholder="地下室面积">
                                          </div>
                                          <label for="inputSaleGardenArea" class="col-sm-2 control-label">花园面积:</label>
                                          <div class="col-sm-4">
                                               <input type="number" class="form-control" id="inputSaleGardenArea" name="gardenArea" min="0" placeholder="花园面积">
                                          </div>
                                     </div>
                                     <div class="form-group">
                                          <label for="inputSaleAvailableArea" class="col-sm-2 control-label">可使用面积:</label>
                                          <div class="col-sm-4">
                                               <input type="number" class="form-control" id="inputSaleAvailableArea" name="availableArea" min="0" placeholder="可使用面积">
                                          </div>
                                          <label for="inputSaleOriginalPrice" class="col-sm-2 control-label">原价:</label>
                                          <div class="col-sm-4">
                                               <input type="number" class="form-control" id="inputSaleOriginalPrice" name="originalPrice" min="0" placeholder="原价">
                                          </div>
                                     </div>
                                      <div class="form-group">
                                          <div class="col-md-offset-4 col-md-4 col-sm-offset-4 col-sm-4 ">
                                               <button type="submit" class="btn btn-primary btn-block" >提交</button>
                                          </div>
                                      </div>
                               </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="tab-pane statistics">
                <div class="tab-content">
                    <div id="myComerStatistics" class="tab-pane active">
                       <ol class="breadcrumb">
                          <li><a href="#">信息统计</a></li>
                          <li class="active"><a href="#">来人信息统计</a></li>
                       </ol>
                       <div class="table-responsive">
                          <table class="table table-hover table-condensed ">
                              <thead>
                                 <tr>
                                    <th>日期</th>
                                    <th>来人访问量</th>
                                    <th>转化率</th>
                                    <th>详细信息</th>
                                 </tr>
                              </thead>
                              <tbody id="comerStatis_pg">
                              </tbody>
                          </table>
                          <nav class="pull-right">
                              <ul class="pagination" id="comerStatisPagination"></ul>
                          </nav>
                       </div>
                    </div>
                    <div id="myCallStatistics" class="tab-pane">
                       <ol class="breadcrumb">
                          <li><a href="#">信息统计</a></li>
                          <li class="active"><a href="#">来电信息统计</a></li>
                       </ol>
                       <div class="table-responsive">
                          <table class="table table-hover table-condensed ">
                              <thead>
                                 <tr>
                                    <th>日期</th>
                                    <th>来电访问量</th>
                                    <th>转化率</th>
                                    <th>详细信息</th>
                                 </tr>
                              </thead>
                              <tbody id="callStatis_pg">
                              </tbody>
                          </table>
                          <nav class="pull-right">
                              <ul class="pagination" id="callStatisPagination"></ul>
                          </nav>
                       </div>
                    </div>
                    <div id="mySaleOrderStatistics" class="tab-pane">
                       <ol class="breadcrumb">
                          <li><a href="#">信息统计</a></li>
                          <li class="active"><a href="#">订单信息统计</a></li>
                       </ol>
                       <div class="table-responsive">
                          <table class="table table-hover table-condensed ">
                              <thead>
                                 <tr>
                                    <th>日期</th>
                                    <th>签订订单量</th>
                                    <th>总金额</th>
                                    <th>热力图</th>
                                 </tr>
                              </thead>
                              <tbody id="saleStatis_pg">
                              </tbody>
                          </table>
                          <nav class="pull-right">
                              <ul class="pagination" id="saleOrderStatisPagination"></ul>
                          </nav>
                       </div>
                    </div>
                    <div id="mySaleContractStatistics" class="tab-pane">
                       <ol class="breadcrumb">
                          <li><a href="#">信息统计</a></li>
                          <li class="active"><a href="#">合同信息统计</a></li>
                       </ol>
                       <div class="table-responsive">
                          <table class="table table-hover table-condensed ">
                              <thead>
                                 <tr>
                                    <th>日期</th>
                                    <th>签订合同量</th>
                                    <th>总金额</th>
                                    <th>详细信息</th>
                                 </tr>
                              </thead>
                              <tbody id="saleContractStatis_pg">
                              </tbody>
                          </table>
                          <nav class="pull-right">
                              <ul class="pagination" id="saleContractStatisPagination"></ul>
                          </nav>
                       </div>
                    </div>
                </div>
            </div>
            <div class="tab-pane sys_manage">
                <div class="tab-content">
                    <div id="myDepartmentManage" class="tab-pane active">
                         <ol class="breadcrumb">
                            <li><a href="#">系统管理</a></li>
                            <li class="active"><a href="#">部门及分子公司管理</a></li>
                         </ol>
                         <div class="btn-group nav">
                            <button data-target="#myDepartmentTable" type="button" class="btn btn-item btn-default active" data-toggle="tab" >部门及分子公司列表</button>
                            <button data-target="#myDepartmentNew" type="button" class="btn btn-item btn-default" data-toggle="tab" >添加部门及分子公司</button>
                         </div>
                         <div><br/></div>
                         <div class="tab-content">
                            <div id="myDepartmentTable" class="tab-pane table-responsive active">
                               <table class="table table-hover table-condensed ">
                                  <thead>
                                 <tr>
                                    <th>部门及分子公司ID</th>
                                    <th>部门及分子公司名称</th>
                                    <th>权限详细信息</th>
                                 </tr>
                              </thead>
                                  <tbody id="department_pg">
                                  </tbody>
                               </table>
                               <nav class="pull-right">
                                  <ul class="pagination" id="departmentPagination"></ul>
                               </nav>
                            </div>
                            <div id="myDepartmentNew" class="tab-pane col-sm-10">
                                <form id="myDepartmentNewForm" class="form-horizontal" action="#">
                                     <div class="form-group">
                                          <label for="inputDepartmentName" class="col-sm-2 control-label">名称:</label>
                                          <div class="col-sm-4">
                                               <input  class="form-control" id="inputDepartmentName" name="department" placeholder="部门或分子公司名称">
                                          </div>
                                          <label class="col-sm-2 control-label">上级部门:</label>
                                          <div class="col-sm-4">
                                               <select name="parent" class="form-control">
                                                   <option>总部</option>
                                                   <option>销售部</option>
                                                   <option>财务部</option>
                                               </select>
                                          </div>
                                     </div>
                                     <div class="form-group">
                                          <label for="inputDepartmentSubNum" class="col-sm-2 control-label">最大子机构数:</label>
                                          <div class="col-sm-4">
                                               <input type="number" class="form-control" id="inputDepartmentSubNum" name="subNum" min="1">
                                          </div>
                                          <label for="inputDepartmentManager" class="col-sm-2 control-label">负责人:</label>
                                          <div class="col-sm-4">
                                               <input type="text" class="form-control" id="inputDepartmentManager" name="manager">
                                          </div>
                                     </div>
                                     <div class="form-group">
                                          <label for="inputDepartmentPhone" class="col-sm-2 control-label">联系电话:</label>
                                          <div class="col-sm-4">
                                               <input type="number" class="form-control" id="inputDepartmentPhone" name="phone">
                                          </div>
                                          <label class="col-sm-2 control-label">账号启用:</label>
                                          <div class="col-sm-4">
                                                <label class="radio-inline">
                                                      <input type="radio" name="disable" checked value="male">开启
                                                </label>
                                                <label class="radio-inline">
                                                      <input type="radio" name="disable"  value="female">关闭
                                                </label>
                                          </div>
                                     </div>
                                     <div class="form-group">
                                          <label for="inputDepartmentAddr" class="col-sm-2 control-label">地址:</label>
                                          <div class="col-sm-10">
                                               <input  class="form-control" id="inputDepartmentAddr" name="addr">
                                          </div>
                                     </div>
                                     <div class="form-group">
                                          <label class="col-sm-2 control-label">备注:</label>
                                          <div class="col-sm-10">
                                               <textarea name="memo" class="form-control"  rows="5"></textarea>
                                          </div>
                                      </div>
                                      <div class="form-group">
                                          <div class="col-md-offset-4 col-md-4 col-sm-offset-4 col-sm-4 ">
                                               <button type="submit" class="btn btn-primary btn-block" >提交</button>
                                          </div>
                                      </div>
                                </form>
                            </div>
                        </div>
                    </div>
                    <div id="myStaffManage" class="tab-pane">
                         <ol class="breadcrumb">
                            <li><a href="#">系统管理</a></li>
                            <li class="active"><a href="#">员工账号管理</a></li>
                         </ol>
                         <div class="btn-group nav">
                            <button data-target="#myStaffTable" type="button" class="btn btn-item btn-default active" data-toggle="tab" >员工列表</button>
                            <button data-target="#myStaffNew" type="button" class="btn btn-item btn-default" data-toggle="tab" >添加员工</button>
                         </div>
                         <div><br/></div>
                         <div class="tab-content">
                            <div id="myStaffTable" class="tab-pane table-responsive active">
                               <table class="table table-hover table-condensed ">
                                  <thead>
                                    <tr>
                                       <th>员工ID</th>
                                       <th>账号</th>
                                       <th>员工</th>
                                       <th>部门</th>
                                       <th>操作</th>
                                    </tr>
                                  </thead>
                                  <tbody id="staff_pg">
                                  </tbody>
                               </table>
                               <nav class="pull-right">
                                  <ul class="pagination" id="staffPagination"></ul>
                               </nav>
                            </div>
                            <div id="myStaffNew" class="tab-pane col-sm-10">
                                <form id="myStaffNewForm" class="form-horizontal"  method="get" action="./reg">
                                     <div class="form-group">
                                          <label for="inputStaffNo" class="col-sm-2 control-label">员工工号:</label>
                                          <div class="col-sm-4">
                                               <input  class="form-control" id="inputStaffNo" name="staffNo" placeholder="工号">
                                          </div>
                                          <label for="inputStaffName" class="col-sm-2 control-label">姓名:</label>
                                          <div class="col-sm-4">
                                               <input  class="form-control" id="inputStaffName" name="name" placeholder="姓名">
                                          </div>
                                     </div>
                                     <div class="form-group">
                                          <label for="inputStaffPassword" class="col-sm-2 control-label">密码:</label>
                                          <div class="col-sm-4">
                                               <input type="password" class="form-control" id="inputStaffPassword" name="password" placeholder="6位以上密码">
                                          </div>
                                          <label for="inputStaffRepeatPassword" class="col-sm-2 control-label">确认密码:</label>
                                          <div class="col-sm-4">
                                               <input type="password" class="form-control" id="inputStaffRepeatPassword" name="repeatpassword" placeholder="密码">
                                          </div>
                                     </div>
                                     <div class="form-group">
                                          <label class="col-sm-2 control-label">账号启用:</label>
                                          <div class="col-sm-4">
                                                <label class="radio-inline">
                                                      <input type="radio" name="disable" checked value="1">开启
                                                </label>
                                                <label class="radio-inline">
                                                      <input type="radio" name="disable"  value="0">关闭
                                                </label>
                                          </div>
                                          <label  class="col-sm-2 control-label">权限角色</label>
                                          <div class="col-sm-4">
                                               <select name="role" class="form-control">
                                                   <option value="1">超级用户</option>
                                                   <option value="2">业务员</option>
                                                   <option value="3">置业顾问</option>
                                               </select>
                                          </div>
                                     </div>
                                     <div class="form-group">
                                          <label class="col-sm-2 control-label">客户性别:</label>
                                          <div class="col-sm-4">
                                                <label class="radio-inline">
                                                      <input type="radio" name="gender" checked value="male">男
                                                </label>
                                                <label class="radio-inline">
                                                      <input type="radio" name="gender"  value="female">女
                                                </label>
                                          </div>
                                          <label for="inputStaffPhone" class="col-sm-2 control-label">电话:</label>
                                          <div class="col-sm-4">
                                               <input  class="form-control" id="inputStaffPhone" name="phone" placeholder="电话">
                                          </div>
                                     </div>
                                     <div class="form-group">
                                          <label for="inputStaffEmail" class="col-sm-2 control-label">邮箱:</label>
                                          <div class="col-sm-4">
                                               <input  class="form-control" id="inputStaffEmail" name="email" placeholder="邮箱">
                                          </div>
                                          <label  class="col-sm-2 control-label">部门</label>
                                          <div class="col-sm-4">
                                               <select name="department" class="form-control">
                                                   <option  value="1">销售部</option>
                                                   <option  value="2">财务部</option>
                                               </select>
                                          </div>
                                     </div>
                                     <div class="form-group">
                                          <label for="inputStaffAddr" class="col-sm-2 control-label">住址:</label>
                                          <div class="col-sm-10">
                                               <input  class="form-control" id="inputStaffAddr" name="addr" placeholder="住址">
                                          </div>
                                      </div>
                                      <div class="form-group">
                                          <label class="col-sm-2 control-label">爱好:</label>
                                          <div class="col-sm-10">
                                               <textarea name="favorite" class="form-control"  rows="5"></textarea>
                                          </div>
                                      </div>
                                      <div class="form-group">
                                          <label class="col-sm-2 control-label">备注:</label>
                                          <div class="col-sm-10">
                                               <textarea name="memo" class="form-control"  rows="5"></textarea>
                                          </div>
                                      </div>
                                      <div class="form-group">
                                          <div class="col-md-offset-4 col-md-4 col-sm-offset-4 col-sm-4 ">
                                               <button type="submit" class="btn btn-primary btn-block" >提交</button>
                                          </div>
                                      </div>
                                </form>
                            </div>
                        </div>
                    </div>
                    <div id="myRoleManage" class="tab-pane">
                         <ol class="breadcrumb">
                            <li><a href="#">系统管理</a></li>
                            <li class="active"><a href="#">权限角色管理</a></li>
                         </ol>
                         <div class="btn-group nav">
                            <button data-target="#myRoleTable" type="button" class="btn btn-item btn-default active" data-toggle="tab" >角色列表</button>
                            <button data-target="#myRoleNew" type="button" class="btn btn-item btn-default" data-toggle="tab" >添加角色</button>
                         </div>
                         <div><br/></div>
                         <div class="tab-content">
                            <div id="myRoleTable" class="tab-pane table-responsive active">
                               <table class="table table-hover table-condensed ">
                                  <thead>
                                    <tr>
                                       <th>角色ID</th>
                                       <th>角色</th>
                                       <th>权限详细信息</th>
                                    </tr>
                                  </thead>
                                  <tbody id="call_pg">
                                  </tbody>
                               </table>
                               <nav class="pull-right">
                                  <ul class="pagination" id="rolePagination"></ul>
                               </nav>
                            </div>
                            <div id="myRoleNew" class="tab-pane col-sm-10">
                                <form id="myRoleNewForm" class="form-horizontal" action="#">
                                   <div class="form-group">
                                        <label for="inputRoleName" class="col-sm-2 control-label">角色名称:</label>
                                        <div class="col-sm-4">
                                            <input type="text" class="form-control" name="rolename" id="inputRoleName" placeholder="名称">
                                        </div>
                                   </div>
                                   <div class="form-group">
                                        <label  class="col-sm-2 control-label">角色权限:</label>
                                        <div class="col-sm-4">
                                             <label class="radio-inline">
                                                <input type="radio" name="permission1"  value="1">开启
                                            </label>
                                            <label class="radio-inline">
                                                <input type="radio" name="permission1" checked value="0">关闭
                                            </label>
                                        </div>
                                   </div>
                                   <div class="form-group">
                                        <label  class="col-sm-2 control-label">角色权限:</label>
                                        <div class="col-sm-4">
                                             <label class="radio-inline">
                                                <input type="radio" name="permission2"  value="1">开启
                                            </label>
                                            <label class="radio-inline">
                                                <input type="radio" name="permission2" checked value="0">关闭
                                            </label>
                                        </div>
                                   </div>
                                   <div class="form-group">
                                        <label  class="col-sm-2 control-label">角色权限:</label>
                                        <div class="col-sm-4">
                                             <label class="radio-inline">
                                                <input type="radio" name="permission3"  value="1">开启
                                            </label>
                                            <label class="radio-inline">
                                                <input type="radio" name="permission3" checked value="0">关闭
                                            </label>
                                        </div>
                                   </div>
                                   <div class="form-group">
                                        <label  class="col-sm-2 control-label">是否启用:</label>
                                        <div class="col-sm-4">
                                             <label class="radio-inline">
                                                <input type="radio" name="disable"  value="0">开启
                                            </label>
                                            <label class="radio-inline">
                                                <input type="radio" name="disable" checked value="1">关闭
                                            </label>
                                        </div>
                                   </div>
                                   <div class="form-group">
                                        <div class="col-md-offset-2 col-md-3 col-sm-offset-2 col-sm-3 ">
                                             <button type="submit" class="btn btn-primary btn-block" >提交</button>
                                        </div>
                                   </div>
                               </form>
                            </div>
                         </div>
                    </div>
                </div>
            </div>
          </div>
        </div>
    </div>
    <div class="myfooter">
        <p>&copy; 金华若缺房地产营销有限公司 2015</p>
    </div>
</div>
<script src="js/jquery-1.11.2.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/jqPaginator.js"></script>
<script src="js/jquery.form.js"></script>
<script src="js/workbench.js"></script>
</body>
</html>
