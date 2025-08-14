package test.java.InterfaceTest.sort.arraySort.LYG4DQS4D;

//基于算法导论快排4衍生极速小高峰缺陷过滤理论快速排序第8代 线性数字数组排序法函数Java完整版本实现。
//思想：算法导论快排4理论, 罗瑶光小高峰过滤理论。
//实现：罗瑶光
//时间：20140101~ 20200711
//复制一份 稍后准备 元基新陈代谢优化
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class LYG9DWithFloatTopSort5D {
    int range;
    int deeps;

    public float[] sort(float[] array, int range, int deeps) {
        this.range = range;
        this.deeps = deeps;
        processFloat(array, 0, array.length - 1, 0);
        return array;
    }

    //增加了deep
    private void processFloat(float[] array, int leftPoint, int rightPoint, int deep) {
        int c = rightPoint - leftPoint + 1;
        if (!(c < this.range || deep > this.deeps)) {
            int pos = partition(array, leftPoint, rightPoint);
            if (leftPoint < pos - 1) {
                processFloat(array, leftPoint, pos - 1, deep + 1);
            }
            if (pos + 1 < rightPoint) {
                processFloat(array, pos + 1, rightPoint, deep + 1);
            }
            return;
        }
        int i = leftPoint;
        for (int j = i + 1; j < leftPoint + c; j = i++) {
            while (j > leftPoint) {
                if (array[j] < array[--j]) {
                    float temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    //养疗经表格出现 关于xnor的=号剔除问题, 这个版本测试成功。已经集成入养疗经
    //从早期把从大到小的>= 的非改为< 当出现大量等值或0的例子, 依旧有个别的重名。
    //增加等于后 消除了重名这个问题, 我在思考, immutable的对象比对需要本身, 所以这里不是 非的问题, 是Xnor的问题。
    //罗瑶光
    //我设立个top2D, --细节竟然没有一个人关注这些细节...20210716
    //等于号不能省, 见从大到小的老版本, > 的非为 <=, 已经在养疗经中测试通过。罗瑶光
    private int partition(float[] array, int leftPoint, int rightPoint) {
        float x = array[leftPoint] <= array[rightPoint] ? array[leftPoint] : array[rightPoint];
        int leftPointReflection = leftPoint;
        while (leftPointReflection < rightPoint) {
            while (!(array[leftPointReflection] > x || leftPointReflection++ >= rightPoint)) {
            }
            while (array[rightPoint--] > x) {
            }
            if (leftPointReflection < ++rightPoint) {
                float temp = array[rightPoint];
                array[rightPoint] = array[leftPointReflection];
                array[leftPointReflection] = temp;
            }
        }
        array[leftPoint] = array[rightPoint];
        array[rightPoint] = x;
        return rightPoint;
    }
}