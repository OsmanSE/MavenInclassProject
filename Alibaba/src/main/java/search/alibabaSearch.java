package search;
import common.CommonAPI;
public class alibabaSearch extends CommonAPI{

    public void searchThings(){

    typeOnElementNEnter("#twotabsearchtextbox","books");
    navigateBack();
    typeOnElementNEnter("#twotabsearchtextbox","honey");
    navigateBack();
    typeOnElementNEnter("#twotabsearchtextbox","iPhone");


}


}
