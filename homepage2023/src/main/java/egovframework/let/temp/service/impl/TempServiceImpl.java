package egovframework.let.temp.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.let.temp.service.TempService;
import egovframework.let.temp.service.TempVO;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("tempService")
public class TempServiceImpl extends EgovAbstractServiceImpl implements TempService {
	
	@Resource(name = "tempDAO")
	private TempDAO tempDAO;
	
	public TempVO selectTemp(TempVO vo) throws Exception{ //로직이 들어가는 부분  
		return tempDAO.selectTemp(vo);
	}
}
