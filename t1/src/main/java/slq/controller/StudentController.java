package slq.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import slq.pojo.Student;
import slq.service.StudentService;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@RequestMapping("/s")
@Controller
public class StudentController {
    @Autowired
    private StudentService ss;

    @RequestMapping("/se")
    @ResponseBody
    public String select() {
        Student student = ss.getStudent(2);
        return student.toString();
    }

    @RequestMapping("/s1")
    public String select1() {
        return "redirect:/1.jsp";
    }
    @RequestMapping(value = "/login", method = {RequestMethod.GET})
    public String login() {
        return "redirect:/index.jsp";
    }
    @RequestMapping(value = "/login", method = {RequestMethod.POST})
    public String login(@RequestParam("user") String u, @RequestParam("pwd") String p, HttpSession s, Model m,
                        HttpServletRequest r) {
        System.out.println(u+":"+p+":"+(u==p)+":"+u.equals(p));
        if (u.equals(p)) {
            s.setAttribute("user", u);
            return "2";
        }else{
            m.addAttribute("msg","账号or密码错误");
            return "forward:/index.jsp";
        }
    }

    @RequestMapping(value = "/logout")
    public String logout(HttpSession s) {
        s.removeAttribute("user");
        return "redirect:/index.jsp";
    }

    @RequestMapping("/s2")
    public String select2(HttpSession s, Model m, HttpServletRequest r) {
        String user = (String) s.getAttribute("user");
        System.out.println(r.getContextPath() + "--------->" + user);
        m.addAttribute("msg", "发送到");
        return "2";
    }
}
