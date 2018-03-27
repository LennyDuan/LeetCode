import { info, debug } from '../../src/util/logger';

/**
 * @param {string} s
 * @param {string} p
 * @return {boolean}
 */
// Use Recursion method
const isMatch = function (s, p) {
  info(`Current S: [${s}]; P: [${p}]`);
  if (p === '') {
    info(`\n------\nString should be empty now: [${s}] - [${s === ''}]\n------\n`);
    return (s === '');
  }

  const firstMatch = (s !== '' &&
  (s.charAt(0) === p.charAt(0) || p.charAt(0) === '.'));
  debug(`First Match s: [${s.charAt(0)}]; p:[${p.charAt(0)}]`);

  if (p.length >= 2 && p.charAt(1) === '*') {
    debug(`Next 2 char DO have *** in p: ${p.slice(0, 2)}`)
    return (isMatch(s, p.substring(2))
            || (firstMatch && isMatch(s.substring(1), p)));
  }
  debug(`Next 2 char do not have * in p: ${p.slice(0, 2)}`)
  return firstMatch && isMatch(s.substring(1), p.substring(1));
};

// const isMatchV1 = function (s, p) {
//   info(`String is [${s}]\nRegExp is: [${p}]`);
//   if (p === '.*') return true;
//   if (p.includes('.*')) {
//     const arr = p.split('.*');
//     debug(`Check includes: [${arr}]`);
//     return arr.every(ele => s.includes(ele));
//   }
//   let i = 0;
//   let j = 0;
//   for (; i < s.length;) {
//     debug(`Index [${i}] - [${j}]`);
//     const str = s.charAt(i);
//     const reg = p.charAt(j);
//     debug(`str: [${str}]`);
//     debug(`reg: [${reg}]`);
//
//     if (reg === '.') {
//       debug(`. Match [${reg}]`);
//       i += 1;
//       j += 1;
//     } else if (reg === str) {
//       debug(`[${reg}] Match [${str}]`);
//       i += 1;
//       j += 1;
//     } else if (p.charAt(j + 1) === '*') {
//       debug(`[${str}] Match 'X*' - 0`);
//       j += 2;
//     } else if (reg === '*' && j > 0) {
//       // 'a*' Match 'aaaaa'
//       debug('XXXX Match \'X*\' - Mutil');
//
//       const matchP = p.charAt(j - 1);
//       debug(`matchP: [${reg}]`);
//
//       while (p.charAt(j) === '*' && i < s.length) {
//         const st = s.charAt(i);
//         if (st === matchP) {
//           i += 1;
//         } else {
//           j += 1;
//         }
//       }
//     } else {
//       return false;
//     }
//   }
//
//   if (p.length > s.length) {
//     const remainP = p.slice(j, p.length);
//     const relen = remainP.length;
//     debug(`remainP: [${remainP}]`);
//     debug(`relen: [${relen}]`);
//     if (relen % 2 !== 0) return false;
//     for (let ri = 1; ri < relen; ri += 2) {
//       if (remainP.charAt(ri) !== '*') return false;
//     }
//   }
//   return true;
// };

// const isMatchV2 = function (s, p) {
//   let str = s;
//   let reg = p;
//   info(`String is [${s}]\nRegExp is: [${p}]`);
//   if (reg === '.*') return true;
//   if (reg.includes('.*')) {
//     const arr = reg.split('.*');
//     debug(`Check includes: [${arr}]`);
//     return arr.every(ele => str.includes(ele));
//   }
//
//   let strS = '';
//   while (str.length > 0) {
//     debug(`\n------------------\n`);
//
//     debug(`String : [${str}]`);
//     debug(`Reg : [${reg}]`);
//     const strF = str.charAt(0);
//     const regF = reg.charAt(0);
//     debug(`String first: [${strF}]`);
//     debug(`Reg first: [${regF}]`);
//
//     if (regF === '.') {
//       info(`. Match [${regF}]`);
//       info(`String remove: [${str.slice(0, 1)}]`);
//       info(`RegExp remove: [${reg.slice(0, 1)}]`)
//       str = str.slice(1);
//       reg = reg.slice(1);
//     } else if (regF === strF) {
//       info(`[${regF}] Match [${strF}]`);
//       info(`String remove: [${str.slice(0, 1)}]`);
//       info(`RegExp remove: [${reg.slice(0, 1)}]`)
//       if(reg.charAt(1) === '*') {
//         strS = str.slice(0, 1);
//         info(`Prev X* is: [${strS}*]`)
//       }
//
//       str = str.slice(1);
//       reg = reg.slice(1);
//     } else if (reg.charAt(1) === '*') {
//       info(`[${strF}] Match 'X*' - 0`);
//       info(`RegExp remove: [${reg.slice(0, 2)}]`)
//       reg = reg.slice(2);
//     } else if (regF === '*') {
//       // 'a*' Match 'aaaaa'
//       info(`${strF}.. Match ${strS}* - Mutil`);
//       while (reg.charAt(0) === '*') {
//         const st = str.charAt(0);
//         if (st === strS) {
//           info(`String remove: [${str.slice(0, 1)}]`);
//           str = str.slice(1);
//         } else {
//           info(`RegExp remove: [${reg.slice(0, 1)}]`);
//           reg = reg.slice(1);
//         }
//       }
//       strS = '';
//     } else {
//       return false;
//     }
//   }
//
//   if (reg.length > 0) {
//     const relen = reg.length;
//     debug(`remain regExp: [${reg}]`);
//     debug(`relen: [${relen}]`);
//     if (relen % 2 !== 0) return false;
//     for (let ri = 1; ri < relen; ri += 2) {
//       if (relen.charAt(ri) !== '*') return false;
//     }
//   }
//   return true;
// };


module.exports = {
  isMatch,
};
