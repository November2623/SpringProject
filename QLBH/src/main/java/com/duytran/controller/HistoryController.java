package com.duytran.controller;

import com.duytran.entity.History;
import com.duytran.repository.HistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class HistoryController {
    @Autowired
    HistoryRepository historyRepository;

    @RequestMapping(value = {"/History","/Admin"}, method = RequestMethod.GET)
    public String historyPage(HttpServletRequest rq){
        List<History> history = historyRepository.findAll();
        rq.setAttribute("history", history);
        return "History";
    }
}