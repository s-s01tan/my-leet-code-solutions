/**
 * @param {number[]} flowerbed
 * @param {number} n
 * @return {boolean}
 */
var canPlaceFlowers = function(flowerbed, n) {
    // Same logic with Java beats 97.48%, but JS is only %6
    // Lesson: Don't care about beat percent, care about Time Complexity which is O(N) here
    flowerbed = [0, ...flowerbed, 0];
    let capacity = 0;

    for (let i = 1; i < flowerbed.length - 1; i++) {
        if ((flowerbed[i-1] + flowerbed[i] + flowerbed[i+1]) == 0) {
            flowerbed[i] = 1;
            capacity++;
        }
    }

    return n <= capacity;
};
