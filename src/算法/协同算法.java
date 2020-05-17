package 算法;

import java.util.*;

/**
 * projectName：test
 * name：协同算法
 * description：todo
 * date：2020/5/16 7:27 下午
 * auther：AlexNi
 */
public class 协同算法 {
    public static void main(String[] args) {
        /*
         * 输入用户-->物品条目  一个用户对应多个物品
         * 用户ID    物品ID集合
         *   A        a b d
         *   B        a c
         *   C        b e
         *   D        c d e
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the total users number:");
        //输入用户总量
        int n = scanner.nextInt();
        //建立用户稀疏矩阵，用于用户相似度计算【相似度矩阵】
        int[][] sparseMatrix = new int[n][n];
        //存储每一个用户对应的不同物品总数  eg: A 3
        Map<String, Integer> userItemLength = new HashMap<>();
        //建立物品到用户的倒排表 eg: a A B
        Map<String, Set<String>> itemUserCollection = new HashMap<>();
        //辅助存储物品集合
        Set<String> items = new HashSet<>();
        //辅助存储每一个用户的用户ID映射
        Map<String, Integer> userId = new HashMap<>();
        //辅助存储每一个ID对应的用户映射
        Map<Integer, String> idUser = new HashMap<>();
        System.out.println("Input user--items maping infermation:<eg:A a b d>");
        scanner.nextLine();
        //依次处理N个用户 输入数据  以空格间隔
        for (int i = 0; i < n; i++) {
            String[] userItem = scanner.nextLine().split(" ");
            int length = userItem.length;
            //eg: A 3
            userItemLength.put(userItem[0], length - 1);
            //用户ID与稀疏矩阵建立对应关系
            userId.put(userItem[0], i);
            idUser.put(i, userItem[0]);
            //建立物品--用户倒排表
            for (int j = 1; j < length; j++) {
                //如果已经包含对应的物品--用户映射，直接添加对应的用户
                if (items.contains(userItem[j])) {
                    itemUserCollection.get(userItem[j]).add(userItem[0]);
                } else {//否则创建对应物品--用户集合映射
                    items.add(userItem[j]);
                    //创建物品--用户倒排关系
                    itemUserCollection.put(userItem[j], new HashSet<String>());
                    itemUserCollection.get(userItem[j]).add(userItem[0]);
                }
            }
        }
        System.out.println(itemUserCollection.toString());
        //计算相似度矩阵【稀疏】
        Set<Map.Entry<String, Set<String>>> entrySet = itemUserCollection.entrySet();
        for (Map.Entry<String, Set<String>> stringSetEntry : entrySet) {
            Set<String> commonUsers = stringSetEntry.getValue();
            for (String userU : commonUsers) {
                for (String userV : commonUsers) {
                    if (userU.equals(userV)) {
                        continue;
                    }
                    //计算用户u与用户v都有正反馈的物品总数
                    sparseMatrix[userId.get(userU)][userId.get(userV)] += 1;
                }
            }
        }
        System.out.println(userItemLength.toString());
        System.out.println("Input the user for recommendation:<eg:A>");
        String recommendUser = scanner.nextLine();
        System.out.println(userId.get(recommendUser));
        //计算用户之间的相似度【余弦相似性】
        int recommendUserId = userId.get(recommendUser);
        for (int j = 0; j < sparseMatrix.length; j++) {
            if (j != recommendUserId) {
                System.out.println(idUser.get(recommendUserId) + "--" + idUser.get(j) + "相似度:" + sparseMatrix[recommendUserId][j] / Math.sqrt(userItemLength.get(idUser.get(recommendUserId)) * userItemLength.get(idUser.get(j))));
            }
        }

        //计算指定用户recommendUser的物品推荐度
        //遍历每一件物品
        for (String item : items) {
            //得到购买当前物品的所有用户集合
            Set<String> users = itemUserCollection.get(item);
            //如果被推荐用户没有购买当前物品，则进行推荐度计算
            if (!users.contains(recommendUser)) {
                double itemRecommendDegree = 0.0;
                for (String user : users) {
                    //推荐度计算
                    itemRecommendDegree += sparseMatrix[userId.get(recommendUser)][userId.get(user)] / Math.sqrt(userItemLength.get(recommendUser) * userItemLength.get(user));
                }
                System.out.println("The item " + item + " for " + recommendUser + "'s recommended degree:" + itemRecommendDegree);
            }
        }
        scanner.close();
    }
}
