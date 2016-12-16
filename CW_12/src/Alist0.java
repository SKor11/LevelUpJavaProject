import java.util.Iterator;

//import java.util.Arrays;


public class Alist0 {
    private int[] ar0 = {};


    public Alist0(int[] ini) {
        init(ini);
    }

    public Alist0() {

    }


    public int size() // size,
    {
        int sizeAr = ar0.length;
        return sizeAr;
    }

    public void init(int[] ini)  // init
    {
        if (ini == null) {
            ar0 = new int[0];
        } else {
            ar0 = new int[ini.length];
            for (int i = 0; i < ini.length; i++) {
                ar0[i] = ini[i];
            }
        }
    }

    public void clear() // clear,
    {
        int[] tmp = {};
        ar0 = tmp;
    }

    public int[] toArray() // to arrey копия,
    {
        int[] arCopy = new int[ar0.length];
        for (int j = 0; j < arCopy.length; j++) {
            arCopy[j] = ar0[j];
        }

        return arCopy;
    }

    public void addStart(int add) // addstart,
    {
        int[] tmp = new int[ar0.length + 1];
        tmp[0] = add;

        for (int j = 1; j < tmp.length; j++) {
            tmp[j] = ar0[j - 1];
        }
        ar0 = tmp;
    }

    public void addEnd(int add) // addend,
    {
        int[] tmp = new int[ar0.length + 1];
        tmp[tmp.length - 1] = add;

        for (int j = 0; j < tmp.length - 1; j++) {
            tmp[j] = ar0[j];
        }
        ar0 = tmp;
    }

    public void addPos(int pos, int add)// addpos,
    {
        int[] tmp = new int[ar0.length + 1];

        for (int j = 0; j < tmp.length; j++) {
            if (j < pos) {
                tmp[j] = ar0[j];
            } else if (j == pos) {
                tmp[pos] = add;
            } else if (j > pos) {
                tmp[j] = ar0[j - 1];
            }
        }
        ar0 = tmp;
    }

    public int delStart() // delstart,
    {
        int[] tmp = new int[ar0.length - 1];
        int ret = ar0[0];

        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = ar0[i + 1];
        }
        ar0 = tmp;
        return ret;
    }


    public int delEnd() // deltend,
    {
        int[] tmp = new int[ar0.length - 1];

        int ret = ar0[ar0.length - 1];

        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = ar0[i];
        }
        ar0 = tmp;

        return ret;
    }


    public int delPos(int pos) // delPos
    {
        int[] tmp = new int[ar0.length - 1];

        int ret = ar0[pos];

        for (int i = 0; i < tmp.length; i++) {
            if (i < pos) {
                tmp[i] = ar0[i];
            } else if (i >= pos) {
                tmp[i] = ar0[i + 1];
            }
        }
        ar0 = tmp;
        return ret;
    }

    public void set(int pos, int val)// set подменяет
    {
        ar0[pos] = val;
    }

    public int get(int pos)// get возвращает по индексу
    {
        int p = ar0[pos];
        return p;
    }

    public int max() // max,
    {
        int max = ar0[0];
        for (int i = 0; i < ar0.length; i++) {
            if (max < ar0[i]) {
                max = ar0[i];
            }
        }
        return max;
    }

    public int min() // min,
    {
        int min = ar0[0];
        for (int i = 0; i < ar0.length; i++) {
            if (min > ar0[i]) {
                min = ar0[i];
            }
        }
        return min;
    }

    public int maxind() // maxind,
    {
        int max = ar0[0];
        int ind = 0;
        for (int i = 0; i < ar0.length; i++) {
            if (max < ar0[i]) {
                max = ar0[i];
                ind++;
            }
        }
        return ind;
    }

    public int minind()    // minind,
    {
        int min = ar0[0];
        int ind = 0;
        for (int i = 0; i < ar0.length; i++) {
            if (min > ar0[i]) {
                min = ar0[i];
                ind++;
            }
        }
        return ind;
    }

    public void sort() // sort,
    {
        for (int i = ar0.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (ar0[j] > ar0[j + 1]) {
                    int tmp = ar0[j];
                    ar0[j] = ar0[j + 1];
                    ar0[j + 1] = tmp;
                }
            }
        }
    }

    public void revers() // revers,
    {
        for (int i = 0; i < ar0.length / 2; i++) {
            int t = ar0[i];
            ar0[i] = ar0[ar0.length - 1 - i];
            ar0[ar0.length - 1 - i] = t;
        }
    }

    public void halfRevers() // halfrevers,
    {
        if (ar0.length % 2 != 0) {
            for (int c = 1, a = 0, b = ar0.length / 2 + 1; c <= ar0.length / 2; a++, b++, c++) {
                int t = ar0[a];
                ar0[a] = ar0[b];
                ar0[b] = t;
            }
        } else {
            for (int c = 1, a = 0, b = ar0.length / 2; c <= ar0.length / 2; a++, b++, c++) {
                int t = ar0[a];
                ar0[a] = ar0[b];
                ar0[b] = t;
            }
        }
    }

    public int sumOdd() // sum odd сумма нечетных элементов
    {
        int sum = 0;

        for (int i = 0; i < ar0.length; i++) {
            if (i % 2 != 0) {
                sum += ar0[i];
            }
        }
        return sum;
    }

    public int quantEven() // quantEven число четных элементов
    {
        int quant = 0;
        for (int i : ar0) {
            if (i % 2 == 0) {
                quant++;
            }
        }
        return quant;

    }


//	public Iterator<Integer> iterator()
//	{
//		return new XZItr(ar0);
//	}
//	class XZItr implements Iterator<Integer>
//	{
//		int[] rr = null;
//		int i = 0;
//		public XZItr(int[] dd)
//		{
//			rr = dd;
//		}
//		@Override
//		public boolean hasNext()
//		{
//			return i < rr.length;
//		}
//
//		@Override
//		public Integer next()
//		{
//			return rr[i++];
//		}L
//	}
//
//	@Override
//	public Iterator<Integer> iterator() 
//	{
//		XZItr itr = new XZItr();
//		return itr;
//	}
//	class XZItr implements Iterator<Integer>
//	{
//		int i = 0;
//		@Override
//		public boolean hasNext() 
//		{
//			return i < ar0.length;
//		}
//
//		@Override
//		public Integer next() 
//		{
//			return ar0[i++];
//		}
//		
//	}

}