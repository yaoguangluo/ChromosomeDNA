package P;

import C_A.OCI.ME.pos.CP.X_P_MingCi;
import ME.VPC.M.app.App;
import S_A.AVQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import S_A.SVQ.stable.S_Maps;
import S_A.SVQ.stable.S_Pos;
import S_A.pheromone.IMV_SIQ_SS;

import java.util.List;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */

public class Pos_X_P_MingCi extends Pos_X_P_LiangCi implements X_P_MingCi {
    public int P_MingCiOfTwo(List<String> outputList, int countLength, String[] strings
        , StringBuilder[] fixWord, int charPosition, StringBuilder inputString) {
        if (wordsForest.containsKey(fixWord[S_Pos.INT_ZERO].toString())) {
            if (S_Maps.liangCi.containsKey(fixWord[S_Pos.INT_ZERO].toString())) {
                countLength = charOfTwo(countLength, outputList, strings, fixWord);
                return countLength;
            }
            boolean find = false;
            if (S_Maps.dongCi.containsKey(fixWord[S_Pos.INT_ZERO].toString())) {
                find = true;
            }
            if (!find) {//later..
                if (S_Maps.xingRongCi.containsKey(fixWord[S_Pos.INT_ZERO].toString())) {
                    find = true;
                }
            }
            if (!find) {
                if (S_Maps.mingCi.containsKey(fixWord[S_Pos.INT_ZERO].toString())) {
                    find = true;
                }
            }
            if (!find) {
                if (S_Maps.zhuCi.containsKey(fixWord[S_Pos.INT_ZERO].toString())) {
                    find = true;
                }
            }
            if (!find) {
                if (S_Maps.liangCi.containsKey(fixWord[S_Pos.INT_ZERO].toString())) {
                    find = true;
                }
            }
            if (find) {
                if (S_Maps.CiTwo.containsKey(strings[S_Pos.INT_ONE])) {
                    fixWord[S_Pos.INT_ZERO].delete(S_Pos.INT_ZERO, fixWord[S_Pos.INT_ZERO].length());
                    fixWord[S_Pos.INT_ZERO].append(strings[S_Pos.INT_ONE]);
                    outputList.add(strings[S_Pos.INT_ONE]);
                    return countLength;
                }
                countLength = charOfTwo(countLength, outputList, strings, fixWord);
                return countLength;
            }
            I_FixWordsOfTwo(charPosition, inputString, fixWord);
            if (S_Pos.INT_ZERO < fixWord[S_Pos.INT_ONE].length()
                && S_Maps.fuCi.containsKey(S_Pos.EMPTY_STRING
                + fixWord[S_Pos.INT_ONE].toString().charAt(S_Pos.INT_ZERO))) {
                countLength = charOfTwo(countLength, outputList, strings, fixWord);
                return countLength;
            }
            if (S_Maps.CiTwo.containsKey(strings[S_Pos.INT_ONE])) {
                outputList.add(strings[S_Pos.INT_ONE]);
                fixWord[S_Pos.INT_ZERO].delete(S_Pos.INT_ZERO
                    , fixWord[S_Pos.INT_ZERO].length());
                fixWord[S_Pos.INT_ZERO].append(strings[S_Pos.INT_ONE]);
                return countLength;
            }
            countLength = charOfTwo(countLength, outputList, strings, fixWord);
            return countLength;
        }
        return countLength;
    }

    public int P_MingCiOfThree(List<String> outputList
        , int countLength, String[] strings, StringBuilder[] fixWord) {
        if (S_Maps.xingWeiCi.containsKey(fixWord[S_Pos.INT_ZERO].toString())
            || S_Maps.mingCi.containsKey(fixWord[S_Pos.INT_ZERO].toString())) {
            if (S_Maps.dongCi.containsKey(strings[S_Pos.INT_TWO])) {
                countLength = charOfThree(countLength, outputList, strings, fixWord);
                return countLength;
            }
            if (S_Maps.dongCi.containsKey(strings[S_Pos.INT_THREE])) {
                if (S_Maps.fuCi.containsKey(S_Pos.EMPTY_STRING
                    + (0 == fixWord[S_Pos.INT_ONE].length()
                    ? "@^_^@" : fixWord[S_Pos.INT_ONE].charAt(S_Pos.INT_ZERO)))) {
                    if (S_Maps.dongCi.containsKey(strings[S_Pos.INT_ONE])
                        || S_Maps.qingTaiCi.containsKey(strings[S_Pos.INT_ONE])) {
                        countLength = twoCharOfThree(countLength, outputList, strings, fixWord);
                        return countLength;
                    }
                    outputList.add(strings[S_Pos.INT_ZERO]);
                    if (S_Maps.CiTwo.containsKey(strings[S_Pos.INT_TWO])) {
                        outputList.add(strings[S_Pos.INT_TWO]);
                        fixWord[S_Pos.INT_ZERO].delete(S_Pos.INT_ZERO, fixWord[S_Pos.INT_ZERO].length());
                        fixWord[S_Pos.INT_ZERO].append(strings[S_Pos.INT_TWO]);
                        return countLength;
                    }
                    fixWord[S_Pos.INT_ZERO].delete(S_Pos.INT_ZERO, fixWord[S_Pos.INT_ZERO].length());
                    fixWord[S_Pos.INT_ZERO].append(strings[S_Pos.INT_ZERO]);
                    return countLength = S_Pos.INT_ONE;
                }
                if (!S_Maps.dingMingCi.containsKey(strings[S_Pos.INT_ZERO])) {
                    if (S_Maps.CiTwo.containsKey(strings[S_Pos.INT_ONE])) {
                        countLength = twoCharOfThree(countLength, outputList, strings, fixWord);
                        return countLength;
                    }
                    outputList.add(strings[S_Pos.INT_ZERO]);
                    fixWord[S_Pos.INT_ZERO].delete(S_Pos.INT_ZERO, fixWord[S_Pos.INT_ZERO].length());
                    fixWord[S_Pos.INT_ZERO].append(strings[S_Pos.INT_ZERO]);
                    return countLength = S_Pos.INT_ONE;
                }
            }
            if (S_Maps.mingCi.containsKey(strings[S_Pos.INT_TWO])) {
                if (S_Pos.INT_ZERO < fixWord[S_Pos.INT_ONE].length()
                    && S_Maps.zhuCi.containsKey(S_Pos.EMPTY_STRING
                    + fixWord[S_Pos.INT_ONE].charAt(S_Pos.INT_ZERO))) {
                    if (S_Maps.CiTwo.containsKey(strings[S_Pos.INT_ONE])) {
                        if (!S_Maps.dongCi.containsKey(fixWord[S_Pos.INT_ZERO].toString())) {
                            countLength = charOfThree(countLength, outputList, strings, fixWord);
                            return countLength;
                        }
                        countLength = twoCharOfThree(countLength, outputList, strings, fixWord);
                        return countLength;
                    }
                    outputList.add(strings[S_Pos.INT_ZERO]);
                    fixWord[S_Pos.INT_ZERO].delete(S_Pos.INT_ZERO, fixWord[S_Pos.INT_ZERO].length());
                    fixWord[S_Pos.INT_ZERO].append(strings[S_Pos.INT_ZERO]);
                    return countLength = S_Pos.INT_ONE;
                }
                countLength = charOfThree(countLength, outputList, strings, fixWord);
                return countLength;
            }
            if (S_Maps.mingCi.containsKey(strings[S_Pos.INT_ONE])
                || S_Maps.fuCi.containsKey(strings[S_Pos.INT_ONE])) {
                countLength = twoCharOfThree(countLength, outputList, strings, fixWord);
                return countLength;
            }
            if (S_Maps.CiTwo.containsKey(strings[S_Pos.INT_TWO])) {
                countLength = charOfThree(countLength, outputList, strings, fixWord);
                return countLength;
            }
            outputList.add(strings[S_Pos.INT_ZERO]);
            fixWord[S_Pos.INT_ZERO].delete(S_Pos.INT_ZERO, fixWord[S_Pos.INT_ZERO].length());
            fixWord[S_Pos.INT_ZERO].append(strings[S_Pos.INT_ZERO]);
            countLength = S_Pos.INT_ONE;
            return countLength;
        }
        if (S_Maps.dongCi.containsKey(strings[S_Pos.INT_THREE])) {
            if (S_Maps.dongCi.containsKey(strings[S_Pos.INT_TWO])) {
                if (S_Maps.mingCi.containsKey(strings[S_Pos.INT_ZERO])) {
                    if (S_Maps.mingCi.containsKey(strings[S_Pos.INT_ONE])) {
                        //版权算法中的流水阀门函数缺失了关于单双开头名词检测语法算法，这里补充下-202508030406 罗瑶光
                        countLength =  twoCharOfThree(countLength, outputList, strings, fixWord);
                        return countLength;
                    }
                    countLength = charOfThree(countLength, outputList, strings, fixWord);
                    return countLength;
                }
            }
            if (null != fixWord[S_Pos.INT_ZERO]
                && S_Pos.INT_ZERO < fixWord[S_Pos.INT_ZERO].length()) {
                if (S_Maps.zhuCi.containsKey(S_Pos.EMPTY_STRING
                    + fixWord[S_Pos.INT_ZERO].charAt(S_Pos.INT_ZERO))) {
                    if (!S_Maps.mingCi.containsKey(strings[S_Pos.INT_ONE])) {
                        countLength = charOfThree(countLength, outputList, strings, fixWord);
                        return countLength;
                    }
                }
            }
            if (S_Maps.CiTwo.containsKey(strings[S_Pos.INT_ONE])) {
                countLength = twoCharOfThree(countLength, outputList, strings, fixWord);
                return countLength;
            }
            countLength = charOfThree(countLength, outputList, strings, fixWord);
            return countLength;
        }
        if (S_Maps.mingCi.containsKey(strings[S_Pos.INT_TWO])) {
            if (S_Pos.INT_ZERO < fixWord[S_Pos.INT_ONE].length()
                && S_Maps.zhuCi.containsKey(S_Pos.EMPTY_STRING
                + fixWord[S_Pos.INT_ONE].charAt(S_Pos.INT_ZERO))) {
                if (S_Maps.CiTwo.containsKey(strings[S_Pos.INT_ONE])) {
                    if (!S_Maps.dongCi.containsKey(fixWord[S_Pos.INT_ZERO].toString())) {
                        countLength = charOfThree(countLength, outputList, strings, fixWord);
                        return countLength;
                    }
                    countLength = twoCharOfThree(countLength, outputList, strings, fixWord);
                    return countLength;
                }
                countLength = charOfThree(countLength, outputList, strings, fixWord);
                return countLength;
            }
            if (S_Pos.INT_ZERO < fixWord[S_Pos.INT_ONE].length()
                && S_Maps.dingMingCi.containsKey(S_Pos.EMPTY_STRING
                + fixWord[S_Pos.INT_ONE].charAt(S_Pos.INT_ZERO))) {
                countLength = twoCharOfThree(countLength, outputList, strings, fixWord);
                return countLength;
            }
            if (S_Maps.dongCi.containsKey(fixWord[S_Pos.INT_ZERO].toString())) {
                if (S_Maps.CiTwo.containsKey(strings[S_Pos.INT_ONE])) {
                    countLength = twoCharOfThree(countLength, outputList, strings, fixWord);
                    return countLength;
                }
            }
            countLength = charOfThree(countLength, outputList, strings, fixWord);
            return countLength;
        }
        if (S_Maps.CiTwo.containsKey(strings[S_Pos.INT_ONE])) {
            outputList.add(strings[S_Pos.INT_ONE]);
            fixWord[S_Pos.INT_ZERO].delete(S_Pos.INT_ZERO, fixWord[S_Pos.INT_ZERO].length());
            fixWord[S_Pos.INT_ZERO].append(strings[S_Pos.INT_ONE]);
            countLength = S_Pos.INT_TWO;
            return countLength;
        }
        outputList.add(strings[S_Pos.INT_ZERO]);
        if (S_Maps.CiTwo.containsKey(strings[S_Pos.INT_TWO])) {
            outputList.add(strings[S_Pos.INT_TWO]);
            fixWord[S_Pos.INT_ZERO].delete(S_Pos.INT_ZERO, fixWord[S_Pos.INT_ZERO].length());
            fixWord[S_Pos.INT_ZERO].append(strings[S_Pos.INT_TWO]);
            return countLength;
        }
        fixWord[S_Pos.INT_ZERO].delete(S_Pos.INT_ZERO, fixWord[S_Pos.INT_ZERO].length());
        fixWord[S_Pos.INT_ZERO].append(strings[S_Pos.INT_ZERO]);
        return countLength = S_Pos.INT_ONE;
    }

    public int P_MingCiOfTwoForMap(IMV_SIQ_SS outputList, int countLength
        , String[] strings, StringBuilder[] fixWord, App NE) {
        if (wordsForest.containsKey(fixWord[S_Pos.INT_ZERO].toString())) {
            if (S_Maps.liangCi.containsKey(fixWord[S_Pos.INT_ZERO].toString())) {
                countLength = charOfTwoForMap(countLength, outputList, strings, fixWord, NE);
                return countLength;
            }
            countLength -= S_Pos.INT_TWO;
            if (wordsForest.containsKey(strings[S_Pos.INT_ONE])) {
                WordFrequency wordFrequency;
                if (outputList.containsKey(strings[S_Pos.INT_ONE])) {
                    wordFrequency = outputList.getW(strings[S_Pos.INT_ONE]);
                    wordFrequency.I_frequency(wordFrequency.get_frequency() + S_Pos.INT_ONE);
                } else {
                    wordFrequency = new WordFrequency(1.0, strings[S_Pos.INT_ONE]);
                }
                wordFrequency.positions.add(NE._I_U.parserCharPosition);
                outputList.put(strings[S_Pos.INT_ONE], wordFrequency);
                fixWord[S_Pos.INT_ZERO].delete(S_Pos.INT_ZERO, fixWord[S_Pos.INT_ZERO].length());
                fixWord[S_Pos.INT_ZERO].append(strings[S_Pos.INT_ONE]);
                countLength += S_Pos.INT_TWO;
            }
            return countLength;
        }
        return countLength;
    }
}
//254 //					WordFrequency wordFrequency= new WordFrequency();
////					wordFrequency.I_frequency(1.0);
////					wordFrequency.I_Word(strings[S_Pos.INT_ONE]);
