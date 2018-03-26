import { info, debug } from '../../src/util/logger';

/**
 * @param {string} s
 * @param {string} p
 * @return {boolean}
 */
const isMatch = function (s, p) {
  info(`String is [${s}]\nRegExp is: [${p}]`);
  if (p === '.*') return true;
  if (p.includes('.*')) {
    const arr = p.split('.*');
    debug(`Check includes: [${arr}]`);
    return arr.every(ele => s.includes(ele));
  }
  let i = 0;
  let j = 0;
  for (; i < s.length; i += 1) {
    const str = s.charAt(i);
    const reg = p.charAt(j);
    debug(`str: [${str}]`);
    debug(`reg: [${reg}]`);

    if (reg === '.') {
      i += 1;
      j += 1;
    } else if (reg === '*' && j !== 0) {
      const preReg = p.charAt(j - 1);
      while (p.charAt(j) !== '*') {
        const st = s.charAt(i);
        if (st === preReg) {
          i += 1;
        } else {
          j += 1;
        }
      }
    } else if (reg === str) {
      i += 1;
      j += 1;
    } else {
      return false;
    }
  }


  return true;
};

module.exports = {
  isMatch,
};
