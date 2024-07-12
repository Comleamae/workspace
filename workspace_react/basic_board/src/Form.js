
function Form({board_list, setBoard_List}) {

  let copyList = [...board_list]

  const getOne = {}

  const regBoard = () => {
    setBoard_List(copyList.push(getOne))
  }

  return (
    <div>
      <table>
        <tr>
          <td>글번호</td>
          <td>
            <input type="text" id="boardNum"></input>
          </td>
        </tr>
        <tr>
          <td>제목</td>
          <td>
            <input type="text" id="title"></input>
          </td>
        </tr>
        <tr>
          <td>작성자</td>
          <td>
            <input type="text" id="writer"></input>
          </td>
        </tr>
        <tr>
          <td>작성일</td>
          <td>
            <input type="text" id="createDate"></input>
          </td>
        </tr>
        <tr>
          <td>내용</td>
          <td>
            <textarea id="content"></textarea>
          </td>
        </tr>
      </table>
      <button type="button" onClick={(e)=>{
        getOne = {
          boardNum: document.querySelector('#boardNum').vlaue,
          title: document.querySelector('#title').vlaue,
          content: document.querySelector('#content').vlaue,
          writer: document.querySelector('#writer').vlaue,
          createDate:document.querySelector('#content').textContent
        }
        regBoard(getOne)
      }}>글등록</button>
    </div>
  )
}

export default Form
