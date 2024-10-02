package bai2;

public class SpecComment extends Comment {
    private String status;
    
    public SpecComment(){
        
    }
    
    public SpecComment(String content, int like, String status){
        super(content,like);
        this.status=status;
    }

    @Override
    public String toString() {
        return super.getContent() + ", " + status + ", " + super.getLike() ;
    }
    
    public void setData(){
        String name = "";
        int check=0;
        for(int i=0;i<super.getContent().length();i++){
            if(check==0){
            if(super.getContent().charAt(i) >= 'A' && super.getContent().charAt(i) <= 'Z'){
                check=1;
                continue;
            }
            }
            name+=super.getContent().charAt(i);
        }
         System.out.println(name + ", " + super.getLike());
    }
    
    public String getValue(){
        int n=super.getContent().length();
        if(super.getLike() <= n) return n + status;
        else return status;
    }
}
