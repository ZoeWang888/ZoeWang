package day10_3;

public class before extends lover{

    private int date1= 20181006;
    private int date2= 20181231;
    public before() {
        super();
    }

    public before(String name) {

    }

    @Override
    public void doing() {
        System.out.println(date1+": 我们稀里糊涂的在一起了，一开始觉得你一点也不靠谱，还超级不贴心！");
        System.out.println("之后就开启了淫荡的生活 啊嘿嘿嘿嘿嘿");
        System.out.println(date2+"：虽然没能满足你的新年愿望能够跨年啪，但也赶上了Long Beach的末班烟花");
    }
}
