import { info, debug } from '../../src/util/logger';

/**
 * @param {number[]} nums
 * @return {number}
 */
const removeDuplicates = function (nums) {
  const map = {}
  for (let i = 0; i < nums.length; i += 1) {
    const ele = nums[i];
    debug(`Next element: ${ele}`);

    if (map[ele] === 1 || map[ele] === 2) {
      map[ele] += 1;
    } else {
      map[ele] = 1;
    }

    if (map[ele] > 2) {
      info(`nums of ${ele} is : ${map[ele]}`)
      nums.splice(i, 1);
      map[ele] -= 1;
    }
  }

  return nums;
};

module.exports = {
  removeDuplicates,
};
