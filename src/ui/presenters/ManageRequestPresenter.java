package ui.presenters;

import java.util.List;
import memorydao.RequestMemoryDAO;
import memorydao.TripMemoryDAO;
import dao.RequestDAO;
import dao.TripDAO;
import domain.Request;
import service.LoginServiceImp;
import ui.views.ManageRequestsView;

public class ManageRequestPresenter {
	
	ManageRequestsView view;
	TripDAO tripDao;
	RequestDAO reqDao;
	
	public ManageRequestPresenter(ManageRequestsView view){
		this.view = view;
		tripDao = new TripMemoryDAO();
		reqDao = new RequestMemoryDAO();
	}
	
	public void start(){
		view.setManageRequestPresenter(this);
		view.open();
	}
	
	protected void setDao(TripDAO dao){ 
		this.tripDao = dao;
	}
	
	public String[] getRequests(){
		List<Request> tempRequest =  reqDao.getPendingRequestByUser(LoginServiceImp.ACTIVE_USER);
		
		int size = tempRequest.size();
		System.out.println(size);
		String[] result = new String[size];
		for (int i = 0; i < size ; i ++){
			result[i] = generateString(tempRequest.get(i));
		
		}
		
		return result;
	}

	private String generateString(Request request) {
		String str = "";
		
		str+=request.getUser().getName() + " " + request.getUser().getSurname();
		
		str+= " Rate: "+ request.getUser().getAverageRate();
		
		str+= " \" " + request.getComment() + " \" ";
		
		return str;
	}
	
	public void approve(int i){
		reqDao.get
	}
}