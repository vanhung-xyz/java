package controller;

import jakarta.servlet.http.HttpSession;
import model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import respository.MemberRespository;
import respository.RoleRespository;

import java.util.Optional;

@Controller
public class SectionController {
    @Autowired
    private MemberRespository memberRespository;


    @Autowired
    private RoleRespository roleRespository;

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @PostMapping("/login")
    public String login(Model model,
                        @RequestParam("username") String username,
                        @RequestParam("password") String password,
                        HttpSession session){
        Optional<Member> optionalMember = memberRespository.findByUsername(username);
        if(optionalMember.isPresent() && optionalMember.get().getPassword().equals(password)){
            Member member = optionalMember.get();

            if (roleRespository.findById(member.getUserId()).equals("Admin")) {
                session.setAttribute("member",optionalMember.get());
                return "redirect:/vihicle-admin";
            } else {
                session.setAttribute("member",optionalMember.get());
                return "redirect:/vihicle-list";
            }
        }else {
            model.addAttribute("error",
                    "Invalid username or password");
            return "index";
        }

    }

    @GetMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();//destroy session
        return "redirect:/";
    }

}
