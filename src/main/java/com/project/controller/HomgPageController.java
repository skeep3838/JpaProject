package com.project.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.model.Customer;
import com.project.model.Item;
import com.project.model.Itemline;
import com.project.model.Orders;
import com.project.service.CustomerService;
import com.project.service.ItemService;
import com.project.service.ItemlineService;
import com.project.service.OrderService;
@Controller
public class HomgPageController {
	CustomerService cService;
	OrderService oService;
	ItemlineService ilService;
	ItemService sService;
	@Autowired
	public void setcService(CustomerService cService) {
		this.cService = cService;
	}
	@Autowired
	public void setoService(OrderService oService) {
		this.oService = oService;
	}
	@Autowired
	public void setilService(ItemlineService ilService) {
		this.ilService = ilService;
	}
	@Autowired
	public void setsService(ItemService sService) {
		this.sService = sService;
	}
//------------Setting----------------------------------------------
	
//----------首頁，客戶資訊-------------------------------------------
	
	@GetMapping("/")
	public String homepage(Model model) {
		List<Customer> cus = cService.getAllCustomer();
		model.addAttribute("customers", cus);
		return "index";
	}
//------------依客戶列表查詢訂單內容----------------------------------
	
	@GetMapping("/order")
	public String getOrderById(@RequestParam("cid") Integer cid,Model model) {
		Customer cus = cService.queryCustomerById(cid);
		model.addAttribute("cid", cid);
		model.addAttribute("cOrder", cus.getOrderList());
		return "order";
	}
//-------------依訂單查詢訂單明細----------------------------------------------------------

	@GetMapping("/itemline")
	public String getOrderDetailOrder(@RequestParam("oid") Integer oid,Model model) {
		Orders order = oService.getOrderByCus(oid);
		model.addAttribute("orderNo", oid);
		model.addAttribute("orderDetail", order.getOrderDetail());
		return "orderDetail";
	}
	
//-------------商品清單------------------------------------------------------------------
	@GetMapping("/items")
	public String getItemList(@RequestParam("cid") Integer cid, Model model) {
		List<Item> itemList = sService.getAllItem();
		model.addAttribute("cid", cid);
		model.addAttribute("itemList", itemList);
		return "itemList";
	}

	@PostMapping("/items")
	public String addOrder(HttpServletRequest req, @RequestParam("cid") Integer cid, Model model) {
		List<Item> itemList = sService.getAllItem();
		List<Itemline> itemOrder = new ArrayList<Itemline>();
		for(Item i:itemList) {
			String par="qty"+i.getIid();
			Integer qty = Integer.parseInt(req.getParameter(par));
			if(qty==0)
				continue;
			Itemline item = new Itemline(null,i.getIid(),qty, null);
			itemOrder.add(item);
		}	
		
		
		return "addOrder";		
	}
	
//---------------確定購買---------------------------------	
	@GetMapping("/addOrder")
	public String shopCart(@RequestParam("cid") Integer cid, 
							@RequestParam("shopCa") String shopCa, Model model) {
		List<Item> itemList = sService.getAllItem();
		model.addAttribute("cid", cid);
		model.addAttribute("shopCa", shopCa);
		return "addOrder";
	}
	
	

}
