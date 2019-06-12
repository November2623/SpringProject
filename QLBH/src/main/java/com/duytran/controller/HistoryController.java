package com.duytran.controller;

import com.duytran.entity.History;
import com.duytran.repository.HistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class HistoryController {
    @Autowired
    HistoryRepository historyRepository;

    @RequestMapping("/History")
    public String historyPage(HttpServletRequest rq){
        List<History> history = historyRepository.findAll();
        rq.setAttribute("history", history);
        return "History";
    }
}