package User;

public class Pure {
    private SaveKokyakuDaityo kokyakuDaityo;
    public void registKokyakuDaityo(){
    	kokyakuDaityo = new SaveKokyakuDaityoFactory().create(3);
    	kokyakuDaityo.save(new PersonFactory().create("‰Ô—¯ ‰Ôq","090-7777-7777","ƒSƒbƒTƒ€ƒVƒeƒB"));
    	kokyakuDaityo.save(new PersonFactory().create("“‡’Ã KŸ","080-3344-4433","“m‰¤’¬"));
    	kokyakuDaityo.save(new PersonFactory().create("_“c ^•Û","070-5555-4444","ƒyƒ“ƒMƒ“‘º"));
    }

    public static void main(String args[]){
    	Pure me = new Pure();
        me.registKokyakuDaityo();
        
        System.out.println("“o˜^Š®—¹!!");
    }
}
