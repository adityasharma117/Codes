class Solution {
    public int maxNumberOfBalloons(String text) {
        char b='b';
        char a='a';
        char l='l';
        char o='o';
        char n='n';
       int ba=0;
       int aa=0;
       int la=0;
       int oa=0;
       int na=0;

        for(int i = 0; i< text.length(); i++){
            switch(text.charAt(i)){
            case 'b':
            ba++;
            break;
            case 'a':
            aa++;
            break;
            case 'l':
            la++;
            break;
            case 'o':
            oa++;
            break;
            case 'n':
            na++;
            break;
        }}
        la=la/2;
        oa=oa/2;
        int min = ba;
        min=Math.min(min,aa);
        min=Math.min(min,la);
        min=Math.min(min,oa);
        min=Math.min(min,na);
        if(ba!=0 && aa!=0 && la!=0 && oa!=0 && na!=0){
        return min;
        }
        else return 0;
    }
    }
