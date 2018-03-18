import { info, debug } from '../../src/util/logger';

/**
 * @param {string} s
 * @return {number}
 */

// Inital thought is using a Queue + hash. Find hash > 1; shift queue util the same.
// A max to record the max
const lengthOfLongestSubstring = function (s) {
  debug(s);
  if (s.length === 1) return 1;
  let max = 0;
  const map = {};
  const queue = [];
  const arr = Array.from(s);
  for (let i = 0; i < s.length; i += 1) {
    const ch = arr[i];
    info(`Next: ${ch}`);
    queue.push(ch);
    info(`Queue: ${queue}`);
    if (map[ch]) {
      info(`Found in map: ${ch} - ${map[ch]}`);
      map[ch] += 1;
    } else {
      info(`Not found in map: ${ch} - ${map[ch]}`);
      map[ch] = 1;
    }
    info(`Map: ${ch} - ${map[ch]}`);

    // if duplicated -> shift queue
    if (map[ch] > 1) {
      info(`Find duplicate map: ${ch} - ${map[ch]}`);

      let first = queue.shift();
      while (first !== ch) {
        first = queue.shift();
        info(`Shift queue element: ${first}`);
      }
      map[ch] -= 1;
    }
    max = max > queue.length ? max : queue.length;
    info(`Max length queue element: ${max}`);
  }
  return queue.length;
};

module.exports = {
  lengthOfLongestSubstring,
};
