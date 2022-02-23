package com.tienda.controller;

import com.tienda.domain.Cliente;
import com.tienda.ClienteDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import java.util.Arrays;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
@Controller
@Slf4j
public class IndexContoller {
@Autowired
public ClienteDao clienteDao;
    @GetMapping("/")
    public String inicio(Model model) {
        log.info("Estamos usando spring");
        var clientes = clienteDao.findAll();
        model.addAttribute("clientes", clientes);
        return "index";
    }

}
