import { info, debug } from '../../src/util/logger';

// Fucking no idea now...
// Well this is not True, I have the fucking idea.
const strP = (s, i, j) => {
  let pre = i;
  let next = j;
  let str = '';
  while (pre >= 0 && next <= s.length - 1
    && s.charAt(pre) === s.charAt(next)) {
    str = s.slice(i, j + 1);
    pre -= 1;
    next += 1;
  }
  return str;
};

/**
 * @param {string} s
 * @return {string}
 */
const longestPalindrome = function (s) {
  info(`String is: [${s}]`);
  if (s.length <= 1) return s;
  let str = s.charAt(0);

  for (let i = 0; i < s.length; i += 1) {
    debug(`Check char [${s.charAt(i)}]`);
    const odd = strP(s, i, i);
    debug(`Odd palindrom: [${odd}]`);
    const even = strP(s, i, i + 1);
    debug(`Even palindrom: [${even}]`);
    str = str.length > odd.length ? str : odd;
    str = str.length > even.length ? str : even;
  }
  return str;
};

module.exports = {
  longestPalindrome,
};
