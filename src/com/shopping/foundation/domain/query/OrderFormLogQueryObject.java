 package com.shopping.foundation.domain.query;
 
 import com.shopping.core.query.QueryObject;
 import org.springframework.web.servlet.ModelAndView;
 
 public class OrderFormLogQueryObject extends QueryObject
 {
   public OrderFormLogQueryObject(String currentPage, ModelAndView mv, String orderBy, String orderType)
   {
     super(currentPage, mv, orderBy, orderType);
   }
 
   public OrderFormLogQueryObject()
   {
   }
 }



 
 