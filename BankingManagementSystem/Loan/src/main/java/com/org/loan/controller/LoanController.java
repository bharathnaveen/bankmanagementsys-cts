package com.org.loan.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.loan.model.LoanModel;


@RestController
public class LoanController {
	@RequestMapping("/loan")
	public List<LoanModel> getLoanDetails () {
		List<LoanModel> loan = new ArrayList<>();
		LoanModel loanModel = new LoanModel();
		loanModel.setBikeloan("Applied");
		loanModel.setHomeloan("Applied");
		loanModel.setPersonalloan("Not Applied");
		loanModel.setCarloan("Applied");
		loan.add(loanModel);
		return loan;
	}

}
