const {returnArray} = require('./TwoSum')

test("test the function returns correct result", () => {

    let number = [1, 2, 3, 4, 5];
    let target = 6;
    let actual = [1, 5];
    let expected = returnArray(number, target)
       
    expect(expected).toEqual(actual)

})
