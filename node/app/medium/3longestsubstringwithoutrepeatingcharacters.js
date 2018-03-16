import { info } from '../../src/util/logger';

/**
 * @param {string} s
 * @return {number}
 */

// Inital thought is using a Queue + hash. Find hash > 1; shift queue util the same.
// A max to record the max
const lengthOfLongestSubstring = function (s) {
  info(s);
  return s;
};

module.exports = {
  lengthOfLongestSubstring,
};
