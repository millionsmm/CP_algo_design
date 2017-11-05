using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

/**
 * Created by LiangHaoXiang
 * on 5/11/2017.
 * <p>
 * 黄金圣斗士拯救雅典娜，雅典娜在右下角
 * 每次只能往右边或者下面走，每个位置的值代表遭遇的事件，如果是负数则扣血
 * 如果是正数则回血，走到任何一个位置，血量都不能少于1，为了保证救出雅典娜，
 * 初始血量至少是多少？
 * <p>
 * -2 　-3　 3
 * -5　-10　 1
 *  0　 30  -5
 *  
 *  v0  v1  v2
 *  v3  v4  v5
 *  v6  v7  v8
 *  
 */

namespace 拯救雅典娜_迪杰斯特拉反算法_求最长路径
{
    class Program
    {
        const int 负无穷 = -10000;

        static void Main(string[] args)
        {
            int[,] w = new int[9, 9];
            for(int i = 0; i < 9; i++)
            {
                for(int j = 0; j < 9; j++)
                {
                    if (i == j)
                        w[i, j] = 0;
                    else
                        w[i, j] = 负无穷;
                }
            }
            //所有往右走的值
            w[0, 1] = -3;   w[1, 2] = 3;
            w[3, 4] = -10;  w[4, 5] = 1;
            w[6, 7] = 30;   w[7, 8] = -5;
            //所有往下走的值
            w[0, 3] = -5;   w[1, 4] = -10;  w[2, 5] = 1;
            w[3, 6] = 0;    w[4, 7] = 30;   w[5, 8] = -5;

            int[] maxValue = new int[9];

            int[] preVertex = new int[9];

            while (true)
            {
                Console.WriteLine();
                Console.WriteLine("请输入初始血量: ");
                int originHp = Convert.ToInt32(Console.ReadLine());

                Fun(w, maxValue, preVertex, originHp);

                for (int i = 1; i <= 8; i++)
                {
                    Console.WriteLine("preV[{0}] = " + preVertex[i] + "  ", i);
                }
            }
        }
        /// <summary>
        /// 反迪杰斯特拉算法_求最长路径
        /// </summary>
        /// <param name="w">value是二维数组，w[i,j]表示边(i,j)的权重，也就是从格子i走到格子j扣掉的血量(即扣掉j格子上的数字量)</param>
        /// <param name="maxValue">maxValue[i]表示从源点到格子i的最大值</param>
        /// <param name="preVertex">preVertex[i]表示从源点到格子i最大值路径上的前一个格子</param>
        /// <param name="originHp">初始血量</param>
        public static void Fun(int[,] w, int[] maxValue, int[] preVertex, int originHp)
        {
            bool[] s = new bool[maxValue.Length];   //s[i]表示集合S是否要包含格子i
            //********初始化maxValue数组和preVertex数组和s数组********//
            for (int i = 1; i < maxValue.Length; i++)
            {
                maxValue[i] = w[0, i];  //把每个从原点到顶点i的最大值初始化于权重
                s[i] = false;
                if (w[0, i] != 负无穷)
                    preVertex[i] = 0;
            }
            maxValue[0] = 0;
            s[0] = false;
            preVertex[0] = -1; //preVertex[0]不存在的
            //********初始化maxValue数组和preVertex数组********//

            //开始迭代比较
            for(int i = 1; i < maxValue.Length; i++)
            {
                //int currentHp = originHp;   //当前血量是满血
                int temp = 负无穷;
                int u = 0;  //变量初始化为原点处

                //int tempCurrentHp1 = currentHp;
                for (int j = 1; j < maxValue.Length; j++)
                {
                    //tempCurrentHp1 = currentHp;
                    //若格子j未被包含于S集合 且 maxValue[j]比之前更大
                    if (s[j] == false && maxValue[j] > temp)
                    {
                        //tempCurrentHp1 += maxValue[j];
                        //且若能保证血量不低于1
                        //if (tempCurrentHp1 >= 1)
                        {
                            u = j;  //记住这个格子
                            temp = maxValue[j];//获取当前从原点到格子j的最大值路径
                        }
                        //else//否则血量低于1的就减回去，不加
                        //    tempCurrentHp1 -= maxValue[j];
                    }
                }
                s[u] = true;    //已经获得最大值路径的maxValue[j]，S集合要包含格子u

                //int tempCurrentHp2 = 0;
                for (int j = 1; j < maxValue.Length; j++)
                {
                    //tempCurrentHp2 = tempCurrentHp1;
                    //若格子j未被包含于S集合 且 权w[u,j]不是负无穷
                    if (s[j] == false && w[u, j] > 负无穷)
                    {
                        int newMaxValue = maxValue[u] + w[u, j];
                        //tempCurrentHp2 += newMaxValue;
                        //若能保证新最大值的血量不低于1 且 大过原来的从原点到j的最大值路径，那新最大值就上位
                        //if (tempCurrentHp2 >= 1)
                        {
                            if (newMaxValue > maxValue[j])
                            {
                                maxValue[j] = newMaxValue;
                                preVertex[j] = u;
                            }
                        }
                        //else//否则血量低于1就减回去，不加
                        //{
                        //    tempCurrentHp2 -= newMaxValue;
                        //}
                    }
                }

            }

            if (s[maxValue.Length - 1] == false) //未包含最后的格子
            {
                Console.WriteLine("未能走到最后的格子，请重新输入初始血量");
            }
        }
    }
}
