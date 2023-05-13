import React from "react";

const TaskTable = () => (
    <table>
        <thead>
            <tr>
                <th>ID from DB</th>
                <th>Task_Name</th>
                <th>Task_Description</th>
                <th>Start_Date</th>
                <th>Finish_Date</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>ID from DB</td>
                <td>Task_Name</td>
                <td>Tast_Description</td>
                <td>Start_Date</td>
                <td>Finish_Date</td>
                <td>
                    <button className="button muted-button"> Edit </button>
                    <button className="button muted-button"> Delete </button>
                </td>
            </tr>
        </tbody>
    </table>
);
export default TaskTable;