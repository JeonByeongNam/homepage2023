package egovframework.let.temp.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.let.temp.service.TempService;
import egovframework.let.temp.service.TempVO;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;

@Service("tempService")
public class TempServiceImpl extends EgovAbstractServiceImpl implements TempService {
	
	/*@Resource(name = "tempDAO")
	private TempDAO tempDAO;*/
	
	@Resource(name="tempMapper")
	private TempMapper tempMapper;
	
	
//	public TempVO selectTemp(TempVO vo) throws Exception{ //로직이 들어가는 부분  
//		return tempDAO.selectTemp(vo);
//	}
	
	public TempVO selectTemp(TempVO vo) throws Exception {
		return tempMapper.selectTemp(vo);
	}
	
	//임시데이터 목록 가져오기
	public List<EgovMap> selectTempList(TempVO vo) throws Exception {
		return tempMapper.selectTempList(vo);
	}
	
	//임시데이터 목록 가져오기
	public String insertTemp(TempVO vo) throws Exception {
		tempMapper.insertTemp(vo);
		return null;
	}
	
	
	
}
