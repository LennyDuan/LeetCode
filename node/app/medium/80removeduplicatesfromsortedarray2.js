import { info, debug } from '../../src/util/logger';

/**
 * @param {number[]} nums
 * @return {number}
 */
const removeDuplicates = function (nums) {
  const map = {}
  let arr = nums;
  let length = arr.length;
  let duplicated = 0;
  for (let i = 0; i < arr.length; i += 1) {
    const ele = arr[i] + 1;
    debug(`Next element: ${ele}`);

    if (map[ele] === 1 || map[ele] === 2) {
      map[ele] += 1;
    } else {
      map[ele] = 1;
    }

    if (map[ele] > 2) {
      info(`nums of ${ele} is : ${map[ele]}`)
      duplicated =+ 1;
      arr.splice(i, 1);
      map[ele] -= 1;
      i -= 1;
    }
  }

  return arr;
};

module.exports = {
  removeDuplicates,
};
