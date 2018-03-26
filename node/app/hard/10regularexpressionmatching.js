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
  for (; i < s.length;) {
    debug(`Index [${i}] - [${j}]`)
    const str = s.charAt(i);
    const reg = p.charAt(j);
    debug(`str: [${str}]`);
    debug(`reg: [${reg}]`);

    if (reg === '.') {
      debug(`. Match [${reg}]`)
      i += 1;
      j += 1;
    } else if (reg === str) {
      debug(`[${reg}] Match [${str}]`)
      i += 1;
      j += 1;
    } else if (p.charAt(j + 1) === '*') {
      debug(`[${str}] Match 'X*' - 0`)
      j += 2;
    } else if (reg === '*' && j > 0) {
      // 'a*' Match 'aaaaa'
      debug(`XXXX Match 'X*' - Mutil`)

      const matchP = p.charAt(j - 1);
      debug(`matchP: [${reg}]`);

      while (p.charAt(j) === '*' && i < s.length) {
        const st = s.charAt(i);
        if (st === matchP) {
          i += 1;
        } else {
          j += 1;
        }
      }
    } else {
      return false;
    }
  }

  if (p.length > s.length) {
    const remainP = p.slice(j, p.length);
    const relen = remainP.length;
    debug(`remainP: [${remainP}]`);
    debug(`relen: [${relen}]`);
    if (relen % 2 !== 0) return false;
    for (let ri = 1; ri < relen; ri += 2) {
      if (remainP.charAt(ri) !== '*') return false;
    }
  }
  return true;
};

module.exports = {
  isMatch,
};
