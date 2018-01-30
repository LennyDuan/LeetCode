/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
let twoSum = function(nums, target) {
    for (let i = 0; i ++ ; i < nums.length - 1) {
        for (let j = i + 1; j ++; j < nums.length - 1) {
            if (nums[i] + nums[j] === target) {
                return [i, j]
            }
        }
    }
};

module.exports = { twoSum }

