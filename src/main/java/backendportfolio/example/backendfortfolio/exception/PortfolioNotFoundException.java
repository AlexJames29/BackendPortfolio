package backendportfolio.example.backendfortfolio.exception;

public class PortfolioNotFoundException extends  RuntimeException{

    public PortfolioNotFoundException (Long id){
        super("Could not found the portfolio" +id);
    }
}
