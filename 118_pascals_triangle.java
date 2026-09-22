class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> finalList = new ArrayList<>();

        int iteration = 0;

        while (iteration != numRows) {
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i <= iteration; i++) {
                if (i == 0 || i == iteration) {
                    list.add(1);
                } else {
                    List<Integer> prevRow = finalList.get(iteration - 1);
                    list.add(prevRow.get(i - 1) + prevRow.get(i));
                }
            }

            finalList.add(list);
            iteration++;
        }

        return finalList;
    }
}
