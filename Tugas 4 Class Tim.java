public class Tim{
    private String nama;
    private Member[] m = new Member[20]; 
    
    public void setMember(Member Lisa){
        int lop =0;
        for ( lop = 0 ; lop < 10; ++lop){
            System.out.println(lop); 
            if (m[lop] == null){ 
                m[lop] = Lisa; 
                break;
            }
        }
    }
    
    public void displayFullMember(){
        for (int lop = 0 ; lop < 10 ; lop++) {
            if ( m[lop] != null){ 
            if ("Member".equals(m[lop].getClass().getSimpleName())) { 
                m[lop].display(); 
            }
            }
        }
    }
    
    public void displayTrainee(){
        for (Member m1 : m) { 
            if (m1 != null){ 
                if ("Trainee".equals(m1.getClass().getSimpleName())) { 
                }
            }
        }
    }
    public void setNama(String nama){
        this.nama = nama; 
    }
    public String getNama(){
        return this.nama; 
    }    