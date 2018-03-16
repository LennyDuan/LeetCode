import { info, debug } from '../../src/util/logger';

/**
 * @param {string} s
 * @return {number}
 */

// Inital thought is using a Queue + hash. Find hash > 1; shift queue util the same.
// A max to record the max
const lengthOfLongestSubstring = function (s) {
  debug(s);
  if (s.length == 1) return 1;
  let max = 0;
  let map = {};
  let queue = [];
  const arr = Array.from(s);
  for (let i in arr) {
    info(arr[i]);
  }
  return s;
};

module.exports = {
  lengthOfLongestSubstring,
};
