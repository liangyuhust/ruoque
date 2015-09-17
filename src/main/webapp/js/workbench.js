$(document).ready(function(){
    $('.list-group-item').on('click', function () {
    	 $(this).parent().find(".list-group-item").removeClass('active');
         $(this).addClass('active');
      });
    $('.btn-item').on('click', function () {
   	    $(this).parent().find(".btn-item").removeClass('active');
        $(this).addClass('active');
     });
    document.onkeypress=function(){
        if(event.keyCode==13){
            return false;
        }
    }
    $("#myComerNewForm").ajaxForm(function() {  
       alert("Thank you for your comment!"); 
       $(this).ajaxSubmit();
       $('#myComerNewForm').clearForm();
       return false;
    });
    $.ajax({
        type:"GET",
        url:"./comer/comers",
        data:"page=1&size=10&json",
        dataType:"json",
        success:function(result){
        	$.jqPaginator('#comerPagination', {
                totalPages: result.totalPage,
                visiblePages: 5,
                currentPage: 1,
                first:'<li class="first"><a href="javascript:;">首页</a></li>',
                prev: '<li class="prev"><a href="javascript:;">上一页</a></li>',
                next: '<li class="next"><a href="javascript:;">下一页</a></li>',
                last:'<li class="last"><a href="javascript:;">尾页</a></li>',
                page: '<li class="page"><a href="javascript:;">{{page}}</a></li>',
                onPageChange: function (num, type) {
                	$.ajax({
                        type:"GET",
                        url:"./comer/comers?page="+num+"&size=10&json",
                        dataType:"json",
                        success:function(data){
                            $("#comer_pg").empty();
                        	for(var item in data.datas){
                        		$('#comer_pg').append('<tr>'
                        				+'<td>'+data.datas[item].created_at+'</td>'
                        				+'<td>'+data.datas[item].name+'</td>'
                        				+'<td>'
                        				+'<span class="glyphicon glyphicon-trash" aria-hidden="true"></span>'
                        				+'&nbsp&nbsp&nbsp&nbsp'
                        				+'<span class="glyphicon glyphicon-search" aria-hidden="true"></span>'
                        				+'</td>'
                        				+'</tr>');
                        	}
                        }
                    });
                }
            });
        }
    });
    
    $.ajax({
        type:"GET",
        url:"./call/calls",
        data:"page=1&size=10&json",
        dataType:"json",
        success:function(result){
        	$.jqPaginator('#callPagination', {
                totalPages: result.totalPage,
                visiblePages: 5,
                currentPage: 1,
                first:'<li class="first"><a href="javascript:;">首页</a></li>',
                prev: '<li class="prev"><a href="javascript:;">上一页</a></li>',
                next: '<li class="next"><a href="javascript:;">下一页</a></li>',
                last:'<li class="last"><a href="javascript:;">尾页</a></li>',
                page: '<li class="page"><a href="javascript:;">{{page}}</a></li>',
                onPageChange: function (num, type) {
                	$.ajax({
                        type:"GET",
                        url:"./call/calls?page="+num+"&size=10&json",
                        dataType:"json",
                        success:function(data){
                            $("#call_pg").empty();
                            for(var item in data.datas){
                        		$('#call_pg').append('<tr>'+'<td>'+data.datas[item].id+'</td>'+'<td>'+data.datas[item].name+'</td>'+'<td></td>'+'</tr>');
                            }
                        }
                    });
                }
            });
        }
    });
    
    $.ajax({
        type:"GET",
        url:"./order/orders",
        data:"page=1&size=10&json",
        dataType:"json",
        success:function(result){
        	$.jqPaginator('#saleOrderPagination', {
                totalPages: result.totalPage,
                visiblePages: 5,
                currentPage: 1,
                first:'<li class="first"><a href="javascript:;">首页</a></li>',
                prev: '<li class="prev"><a href="javascript:;">上一页</a></li>',
                next: '<li class="next"><a href="javascript:;">下一页</a></li>',
                last:'<li class="last"><a href="javascript:;">尾页</a></li>',
                page: '<li class="page"><a href="javascript:;">{{page}}</a></li>',
                onPageChange: function (num, type) {
                	$.ajax({
                        type:"GET",
                        url:"./order/orders?page="+num+"&size=10&json",
                        dataType:"json",
                        success:function(data){
                            $("#saleOrder_pg").empty();
                            for(var item in data.datas){
                        		$('#saleOrder_pg').append('<tr>'+'<td>'+data.datas[item].id+'</td>'+'<td>'+data.datas[item].name+'</td>'+'<td></td>'+'</tr>');
                            }
                        }
                    });
                }
            });
        }
    });
    
    $.ajax({
        type:"GET",
        url:"./contract/contracts",
        data:"page=1&size=10&json",
        dataType:"json",
        success:function(result){
        	$.jqPaginator('#saleContractPagination', {
                totalPages: result.totalPage,
                visiblePages: 5,
                currentPage: 1,
                first:'<li class="first"><a href="javascript:;">首页</a></li>',
                prev: '<li class="prev"><a href="javascript:;">上一页</a></li>',
                next: '<li class="next"><a href="javascript:;">下一页</a></li>',
                last:'<li class="last"><a href="javascript:;">尾页</a></li>',
                page: '<li class="page"><a href="javascript:;">{{page}}</a></li>',
                onPageChange: function (num, type) {
                	$.ajax({
                        type:"GET",
                        url:"./contract/contracts?page="+num+"&size=10&json",
                        dataType:"json",
                        success:function(data){
                            $("#saleContract_pg").empty();
                            for(var item in data.datas){
                        		$('#saleContract_pg').append('<tr>'+'<td>'+data.datas[item].id+'</td>'+'<td>'+data.datas[item].name+'</td>'+'<td></td>'+'</tr>');
                            }
                        }
                    });
                }
            });
        }
    });
    $.jqPaginator('#comerStatisPagination', {
        totalPages: 100,
        visiblePages: 5,
        currentPage: 1,
        first:'<li class="first"><a href="javascript:;">首页</a></li>',
        prev: '<li class="prev"><a href="javascript:;">上一页</a></li>',
        next: '<li class="next"><a href="javascript:;">下一页</a></li>',
        last:'<li class="last"><a href="javascript:;">尾页</a></li>',
        page: '<li class="page"><a href="javascript:;">{{page}}</a></li>',
        onPageChange: function (num, type) {
        }
    });
    $.jqPaginator('#callStatisPagination', {
        totalPages: 100,
        visiblePages: 5,
        currentPage: 1,
        first:'<li class="first"><a href="javascript:;">首页</a></li>',
        prev: '<li class="prev"><a href="javascript:;">上一页</a></li>',
        next: '<li class="next"><a href="javascript:;">下一页</a></li>',
        last:'<li class="last"><a href="javascript:;">尾页</a></li>',
        page: '<li class="page"><a href="javascript:;">{{page}}</a></li>',
        onPageChange: function (num, type) {
        }
    });
    $.jqPaginator('#saleOrderStatisPagination', {
        totalPages: 100,
        visiblePages: 5,
        currentPage: 1,
        first:'<li class="first"><a href="javascript:;">首页</a></li>',
        prev: '<li class="prev"><a href="javascript:;">上一页</a></li>',
        next: '<li class="next"><a href="javascript:;">下一页</a></li>',
        last:'<li class="last"><a href="javascript:;">尾页</a></li>',
        page: '<li class="page"><a href="javascript:;">{{page}}</a></li>',
        onPageChange: function (num, type) {
        }
    });
    $.jqPaginator('#saleContractStatisPagination', {
        totalPages: 100,
        visiblePages: 5,
        currentPage: 1,
        first:'<li class="first"><a href="javascript:;">首页</a></li>',
        prev: '<li class="prev"><a href="javascript:;">上一页</a></li>',
        next: '<li class="next"><a href="javascript:;">下一页</a></li>',
        last:'<li class="last"><a href="javascript:;">尾页</a></li>',
        page: '<li class="page"><a href="javascript:;">{{page}}</a></li>',
        onPageChange: function (num, type) {
        }
    });
    $.ajax({
        type:"GET",
        url:"./department/departments",
        data:"page=1&size=10&json",
        dataType:"json",
        success:function(result){
        	$.jqPaginator('#departmentPagination', {
                totalPages: result.totalPage,
                visiblePages: 5,
                currentPage: 1,
                first:'<li class="first"><a href="javascript:;">首页</a></li>',
                prev: '<li class="prev"><a href="javascript:;">上一页</a></li>',
                next: '<li class="next"><a href="javascript:;">下一页</a></li>',
                last:'<li class="last"><a href="javascript:;">尾页</a></li>',
                page: '<li class="page"><a href="javascript:;">{{page}}</a></li>',
                onPageChange: function (num, type) {
                	$.ajax({
                        type:"GET",
                        url:"./department/departments?page="+num+"&size=10&json",
                        dataType:"json",
                        success:function(data){
                            $("#department_pg").empty();
                            for(var item in data.datas){
                        		$('#department_pg').append('<tr>'
                        				+'<td>'+data.datas[item].id+'</td>'
                        				+'<td>'+data.datas[item].department+'</td>'
                        				+'<td></td>'+'</tr>');
                            }
                        }
                    });
                }
            });
        }
    });
    $.ajax({
        type:"GET",
        url:"./role/roles",
        data:"page=1&size=10&json",
        dataType:"json",
        success:function(result){
        	$.jqPaginator('#rolePagination', {
                totalPages: result.totalPage,
                visiblePages: 5,
                currentPage: 1,
                first:'<li class="first"><a href="javascript:;">首页</a></li>',
                prev: '<li class="prev"><a href="javascript:;">上一页</a></li>',
                next: '<li class="next"><a href="javascript:;">下一页</a></li>',
                last:'<li class="last"><a href="javascript:;">尾页</a></li>',
                page: '<li class="page"><a href="javascript:;">{{page}}</a></li>',
                onPageChange: function (num, type) {
                	$.ajax({
                        type:"GET",
                        url:"./role/roles?page="+num+"&size=10&json",
                        dataType:"json",
                        success:function(data){
                            $("#role_pg").empty();
                            for(var item in data.datas){
                        		$('#role_pg').append('<tr>'
                        				+'<td>'+data.datas[item].id+'</td>'
                        				+'<td>'+data.datas[item].roleName+'</td>'
                        				+'<td></td>'+'</tr>');
                            }
                        }
                    });
                }
            });
        }
    });
    $.ajax({
        type:"GET",
        url:"./staff/staffs",
        data:"page=1&size=10&json",
        dataType:"json",
        success:function(result){
        	$.jqPaginator('#staffPagination', {
                totalPages: result.totalPage,
                visiblePages: 5,
                currentPage: 1,
                first:'<li class="first"><a href="javascript:;">首页</a></li>',
                prev: '<li class="prev"><a href="javascript:;">上一页</a></li>',
                next: '<li class="next"><a href="javascript:;">下一页</a></li>',
                last:'<li class="last"><a href="javascript:;">尾页</a></li>',
                page: '<li class="page"><a href="javascript:;">{{page}}</a></li>',
                onPageChange: function (num, type) {
                	$.ajax({
                        type:"GET",
                        url:"./staff/staffs?page="+num+"&size=10&json",
                        dataType:"json",
                        success:function(data){
                            $("#staff_pg").empty();
                            for(var item in data.datas){
                        		$('#staff_pg').append('<tr>'
                        				+'<td>'+data.datas[item].created_at+'</td>'
                        				+'<td>'+data.datas[item].staffNo+'</td>'
                        				+'<td>'+data.datas[item].name+'</td>'
                        				+'<td>'+data.datas[item].role+'</td>'
                        				+'<td>'
                        				+'<span class="glyphicon glyphicon-trash" aria-hidden="true"></span>'
                        				+'&nbsp&nbsp&nbsp&nbsp'
                        				+'<span class="glyphicon glyphicon-search" aria-hidden="true"></span>'
                        				+'</td>'
                        				+'<td></td>'+'</tr>');
                            }
                        }
                    });
                }
            });
        }
    });
});