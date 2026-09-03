class Solution {
    public long mostPoints(int[][] questions) {
        int n = questions.length;
        // dp[i] = max points accumulated upon arriving at index i
        long[] dp = new long[n + 1];

        for (int i = 0; i < n; i++) {
            // Choice 1: Skip to the next question
            dp[i + 1] = Math.max(dp[i + 1], dp[i]);

            // Choice 2: Solve the current question and push score to the future
            int points = questions[i][0];
            int brainpower = questions[i][1];
            int nextIndex = i + brainpower + 1;

            // Cap the jump at n so it doesn't go out of bounds
            if (nextIndex > n) {
                nextIndex = n;
            }

            dp[nextIndex] = Math.max(dp[nextIndex], dp[i] + points);
        }

        // dp[n] holds the best score after passing the end of all questions
        return dp[n];
    }
}